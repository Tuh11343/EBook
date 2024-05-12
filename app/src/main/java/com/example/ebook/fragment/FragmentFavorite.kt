package com.example.ebook.fragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.ebook.adapter.BookViewNormalVerticalAdapter
import com.example.ebook.databinding.FragmentFavoriteBinding
import com.example.ebook.listener.IBookListener
import com.example.ebook.model.Book
import com.example.ebook.utils.AppInstance
import com.example.ebook.viewmodels.FavoriteViewModel
import com.example.ebook.viewmodels.MainViewModel
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper


class FragmentFavorite(
) : Fragment() {

    private lateinit var binding: FragmentFavoriteBinding
    private lateinit var favoriteViewModel: FavoriteViewModel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        favoriteViewModel = ViewModelProvider(requireActivity())[FavoriteViewModel::class.java]
        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        binding = FragmentFavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


    override fun onResume() {
        super.onResume()
        observe()
        setUpBinding()

        if(AppInstance.currentAccount!=null){
            favoriteViewModel.findBookList(AppInstance.currentAccount!!.user_id!!)
        }
    }

    private fun setUpBinding(){

    }

    private fun observe() {
        observeBookList()
    }

    private fun observeBookList() {
        favoriteViewModel.bookList.observe(viewLifecycleOwner) { bookList ->

            binding.bookList.adapter =
                BookViewNormalVerticalAdapter(bookList, object : IBookListener {
                    override fun onBookClick(book: Book) {
                        //Check if book premium
                        bookClickHandle(book)
                    }

                })
            val snapperWithCard = GravitySnapHelper(Gravity.START)
            snapperWithCard.attachToRecyclerView(binding.bookList)

            binding.filterSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    if(favoriteViewModel.bookList.value!!.isNotEmpty()){
                        if(position==0){
                            favoriteViewModel.bookList.value!!.sortByDescending { it.id }
                        }else if(position==1){
                            favoriteViewModel.bookList.value!!.sortByDescending { it.rating }
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // Xử lý khi không có mục nào được chọn
                }
            }

            binding.bookAmount.text="Tổng cộng ${bookList.size} sách"
        }
    }


    private fun bookClickHandle(book: Book) {
        if (book.book_type == Book.BookType.PREMIUM) {
            if(AppInstance.currentAccount==null){
                Toast.makeText(
                    requireContext(),
                    "Bạn cần đăng nhập tài khoản để truy cập",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                val currentAccountSubscription = AppInstance.currentSubscription
                if (currentAccountSubscription!!.book_type == Book.BookType.PREMIUM) {
                    bookClick(book)
                } else {
                    Toast.makeText(
                        requireContext(),
                        "Bạn cần nâng cấp tài khoản để truy cập",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }


        } else if (book.book_type == Book.BookType.NORMAL) {
            bookClick(book)
        }
    }

    private fun bookClick(book: Book) {
        mainViewModel.updateSelectedBook(book)
        mainViewModel.updateLastState2(null)
        mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.DetailBook)
    }


}


