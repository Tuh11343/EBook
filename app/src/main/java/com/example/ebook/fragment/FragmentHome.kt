package com.example.ebook.fragment

import android.os.Bundle
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.ebook.adapter.BookViewNormalAdapter
import com.example.ebook.adapter.BookWithBigCardAdapter
import com.example.ebook.adapter.BookWithMultiAdapter
import com.example.ebook.adapter.ContinueBookAdapter
import com.example.ebook.adapter.HomeAuthorAdapter
import com.example.ebook.databinding.FragmentHomeBinding
import com.example.ebook.listener.IBookListener
import com.example.ebook.model.Book
import com.example.ebook.utils.AppInstance
import com.example.ebook.viewmodels.HomeViewModel
import com.example.ebook.viewmodels.MainViewModel
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper


class FragmentHome() : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private lateinit var homeViewModel: HomeViewModel
    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        homeViewModel = ViewModelProvider(requireActivity())[HomeViewModel::class.java]
        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpBinding()

        observe()
    }

    private fun setUpBinding() {
        //Call API
        homeViewModel.findAllBookList(12, 0)
        homeViewModel.findAllAuthorList(12, 0)
        homeViewModel.findNormalBook(12, 0)
        homeViewModel.findPremiumBook(12, 0)
    }

    private fun observe() {
        observeBigCardBookList()
        observeAuthorList()
    }


    private fun observeBigCardBookList() {
        homeViewModel.bigCardBookList.observe(viewLifecycleOwner) { bookList ->
            binding.bigCardBookList.adapter =
                BookWithBigCardAdapter(bookList, object : IBookListener {
                    override fun onBookClick(book: Book) {

                        //Check if book premium
                        bookClickHandle(book)
                    }

                })
            binding.bigCardBookList.setIntervalRatio(0.8f)
            binding.bigCardBookList.setInfinite(true)

            //------------------------------------------------------------------------------------//

            binding.yourTypeBookList.adapter =
                BookViewNormalAdapter(bookList, object : IBookListener {
                    override fun onBookClick(book: Book) {
                        //Check if book premium
                        bookClickHandle(book)
                    }

                })
            val snapperWithCard = GravitySnapHelper(Gravity.START)
            snapperWithCard.attachToRecyclerView(binding.yourTypeBookList)

            //------------------------------------------------------------------------------------//

            binding.continueBookList.adapter =
                ContinueBookAdapter(bookList, object : IBookListener {
                    override fun onBookClick(book: Book) {
                        //Check if book premium
                        bookClickHandle(book)
                    }

                })
            val snapperContinueBook = GravitySnapHelper(Gravity.START)
            snapperContinueBook.attachToRecyclerView(binding.continueBookList)

            //------------------------------------------------------------------------------------//

            binding.freeBookList.adapter =
                BookWithMultiAdapter(bookList, "Miễn phí", object : IBookListener {
                    override fun onBookClick(book: Book) {
                        //Check if book premium
                        bookClickHandle(book)
                    }

                })
            val snapper = GravitySnapHelper(Gravity.START)
            snapper.attachToRecyclerView(binding.freeBookList)

        }

    }

    private fun bookClickHandle(book: Book) {
        if (book.bookType == Book.BookType.PREMIUM) {
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

        } else if (book.bookType == Book.BookType.NORMAL) {
            bookClick(book)
        }
    }

    private fun bookClick(book: Book) {
        mainViewModel.updateSelectedBook(book)
        mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.DetailBook)
    }

    private fun observeAuthorList() {
        homeViewModel.authorList.observe(viewLifecycleOwner) { authorList ->
            binding.authorList.adapter = HomeAuthorAdapter(authorList)
            val authorSnapper = GravitySnapHelper(Gravity.START)
            authorSnapper.attachToRecyclerView(binding.authorList)
        }
    }

}