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
import com.bumptech.glide.Glide
import com.example.ebook.R
import com.example.ebook.adapter.BookViewNormalAdapter
import com.example.ebook.databinding.FragmentAuthorBinding
import com.example.ebook.listener.IBookListener
import com.example.ebook.model.Book
import com.example.ebook.utils.AppInstance
import com.example.ebook.viewmodels.AuthorViewModel
import com.example.ebook.viewmodels.MainViewModel
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper


class FragmentAuthor(
) : Fragment() {

    private lateinit var binding: FragmentAuthorBinding
    private lateinit var authorViewModel: AuthorViewModel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        authorViewModel = ViewModelProvider(requireActivity())[AuthorViewModel::class.java]
        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        binding = FragmentAuthorBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        super.onStart()
        observe()
        authorViewModel.findBookList(mainViewModel.selectedAuthor.value!!.id!!)
        setUpBinding()
    }

    private fun setUpBinding(){

        binding.btnBack.setOnClickListener{
            mainViewModel.updateCurrentState(mainViewModel.lastState.value!!)
        }

        Glide.with(requireContext())
            .load(mainViewModel.selectedAuthor.value!!.image)
            .placeholder(R.drawable.song_circle)
            .error(R.drawable.song_circle)
            .into(binding.authorImg)

        binding.authorName.text=mainViewModel.selectedAuthor.value!!.name
        binding.authorDescription.text=mainViewModel.selectedAuthor.value!!.description

    }

    private fun observe() {
        observeBookList()
    }

    private fun observeBookList() {
        authorViewModel.bookList.observe(viewLifecycleOwner) { bookList ->

            binding.bookAmount.text="Số lượng sách: ${bookList.size}"

            binding.bookList.adapter =
                BookViewNormalAdapter(bookList, object : IBookListener {
                    override fun onBookClick(book: Book) {
                        //Check if book premium
                        bookClickHandle(book)
                    }

                })
            val snapperWithCard = GravitySnapHelper(Gravity.START)
            snapperWithCard.attachToRecyclerView(binding.bookList)

            binding.filterSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    if(authorViewModel.bookList.value!!.isNotEmpty()){
                        if(position==0){
                            authorViewModel.bookList.value!!.sortByDescending { it.id }
                        }else if(position==1){
                            authorViewModel.bookList.value!!.sortByDescending { it.rating }
                        }
                    }
                }

                override fun onNothingSelected(parent: AdapterView<*>?) {
                    // Xử lý khi không có mục nào được chọn
                }
            }
        }
    }


    private fun bookClickHandle(book: Book) {
        if (book.book_type == Book.BookType.PREMIUM) {
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

        } else if (book.book_type == Book.BookType.NORMAL) {
            bookClick(book)
        }
    }

    private fun bookClick(book: Book) {
        mainViewModel.updateSelectedBook(book)
        mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.DetailBook)
    }


}


