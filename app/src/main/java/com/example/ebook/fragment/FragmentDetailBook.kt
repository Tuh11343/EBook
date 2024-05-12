package com.example.ebook.fragment

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.example.ebook.R
import com.example.ebook.adapter.BookDetailGenreAdapter
import com.example.ebook.adapter.HomeAuthorAdapter
import com.example.ebook.databinding.FragmentDetailBookBinding
import com.example.ebook.listener.IAuthorListener
import com.example.ebook.model.Author
import com.example.ebook.model.Book
import com.example.ebook.utils.AppInstance
import com.example.ebook.viewmodels.BookDetailViewModel
import com.example.ebook.viewmodels.MainViewModel
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper


class FragmentDetailBook(
) : Fragment() {

    private lateinit var binding: FragmentDetailBookBinding
    private lateinit var bookDetailViewModel: BookDetailViewModel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        bookDetailViewModel = ViewModelProvider(requireActivity())[BookDetailViewModel::class.java]
        binding = FragmentDetailBookBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onResume() {
        super.onResume()
        observe()
        setUpBinding()
    }

    private fun setUpBinding(){

        binding.btnFavorite.setOnClickListener {

            if (AppInstance.currentAccount == null) {
                Toast.makeText(
                    requireContext(),
                    "Bạn cần đăng nhập để sử dụng tính năng này",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                bookDetailViewModel.favoriteClick(
                    AppInstance.currentAccount!!.user_id,
                    mainViewModel.selectedBook.value!!.id!!
                )
            }
        }

        binding.bookName.text = mainViewModel.selectedBook.value!!.name
        binding.bookDescription.text = mainViewModel.selectedBook.value!!.description ?: "Không có thông tin về sách"
        Glide.with(requireContext())
            .load(mainViewModel.selectedBook.value!!.image)
            .placeholder(R.drawable.song_circle)
            .error(R.drawable.song_circle)
            .into(binding.bookImg)

        binding.btnBack.setOnClickListener {

            if(mainViewModel.lastState2.value!=null){
                mainViewModel.updateCurrentState(mainViewModel.lastState2.value!!)
            }else{
                mainViewModel.updateCurrentState(mainViewModel.lastState.value!!)
            }
        }

        binding.playClickView.setOnClickListener {
            mainViewModel.resetAudio()
            mainViewModel.updateLastState2(mainViewModel.lastState.value!!)
            mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.ReadBook)
        }

        //Call API
        bookDetailViewModel.findAuthorsByBookID(mainViewModel.selectedBook.value!!.id, 10, 0)
        bookDetailViewModel.findGenresByBookID(mainViewModel.selectedBook.value!!.id, 100, 0)
    }

    private fun observe() {
        observeAuthors()
        observeGenres()
        /*observeAuthorBookList()*/
        observeFavoriteClick()
    }

    private fun observeAuthors() {
        bookDetailViewModel.authorList.observe(viewLifecycleOwner) { authorList ->
            binding.authorName.text = authorList.joinToString(separator = ",") { it.name }

            binding.authorList.adapter = HomeAuthorAdapter(authorList,object: IAuthorListener {
                override fun onAuthorClick(author: Author) {
                    mainViewModel.updateSelectedAuthor(author)
                    mainViewModel.updateLastState2(mainViewModel.lastState.value!!)
                    mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.Author)
                }

            })
            val authorSnapper = GravitySnapHelper(Gravity.START)
            authorSnapper.attachToRecyclerView(binding.authorList)

        }
    }

    private fun observeGenres() {
        bookDetailViewModel.genreList.observe(viewLifecycleOwner) { genreList ->
            binding.genreList.adapter = BookDetailGenreAdapter(genreList)
            val genreListSnapper = GravitySnapHelper(Gravity.START)
            genreListSnapper.attachToRecyclerView(binding.genreList)
        }
    }

    /*private fun observeAuthorBookList() {
        bookDetailViewModel.authorBookList.observe(viewLifecycleOwner) { bookList ->
            binding.authorBookList.adapter =
                BookViewNormalAdapter(bookList, object : IBookListener {
                    override fun onBookClick(book: Book) {

                        //Check if book premium
                        bookClickHandle(book)
                    }

                })

            val authorBookListSnapper = GravitySnapHelper(Gravity.START)
            authorBookListSnapper.attachToRecyclerView(binding.authorBookList)
        }
    }*/

    private fun observeFavoriteClick() {
        bookDetailViewModel.favoriteClick.observe(viewLifecycleOwner) { boolean ->

            if(boolean){
                Toast.makeText(requireContext(),"Thêm vào danh sách yêu thích thành công",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(requireContext(),"Đã xóa khỏi danh sách yêu thích",Toast.LENGTH_SHORT).show()
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


