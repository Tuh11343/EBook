package com.example.ebook.fragment

import android.app.Dialog
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ebook.adapter.FilterBottomSheetAdapter
import com.example.ebook.adapter.SearchBookViewAdapter
import com.example.ebook.adapter.SortBottomSheetAdapter
import com.example.ebook.databinding.FilterBottomSheetBinding
import com.example.ebook.databinding.FragmentSearchBinding
import com.example.ebook.databinding.SortBottomSheetBinding
import com.example.ebook.listener.FilterListener
import com.example.ebook.listener.SearchBookListener
import com.example.ebook.listener.SortListener
import com.example.ebook.model.Book
import com.example.ebook.model.Genre
import com.example.ebook.utils.AppInstance
import com.example.ebook.utils.PaginationScrollListener
import com.example.ebook.viewmodels.MainViewModel
import com.example.ebook.viewmodels.SearchViewModel
import com.google.android.material.R
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class FragmentSearch : Fragment() {

    private lateinit var binding: FragmentSearchBinding
    private lateinit var searchViewModel: SearchViewModel
    private lateinit var mainViewModel: MainViewModel
    private lateinit var modalFilterBottomSheet: ModalBottomSheet
    private lateinit var modalSortBottomSheet: ModalSortBottomSheet
    private lateinit var searchViewAdapter: SearchBookViewAdapter
    private var genreFilter: Genre? = null
    private var bookSearchLimit=12
    private var bookSearchMoreLimit=5

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        mainViewModel = ViewModelProvider(requireActivity())[MainViewModel::class.java]
        searchViewModel = ViewModelProvider(requireActivity())[SearchViewModel::class.java]
        binding = FragmentSearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        searchViewModel.loadFilterGenres(null, null)

        setUpComponent()
        observe()
    }

    override fun onStart() {
        super.onStart()
        findBookList("",
            genreFilter?.id)
    }

    private fun observeGenreList() {
        searchViewModel.filterGenreList.observe(viewLifecycleOwner) { genreList ->
            modalFilterBottomSheet = ModalBottomSheet(genreList, object : FilterListener {
                override fun onGenreClick(genre: Genre?) {
                    genreFilter = genre
                    binding.bookList.clearOnScrollListeners()
                    binding.bookList.adapter=null
                    findBookList(binding.searchBar.query.toString(),
                        genreFilter?.id)
                }
            })
        }
    }

    private fun showFilterBottomSheet() {
        if (modalFilterBottomSheet.isAdded) {
            modalFilterBottomSheet.dialog!!.show()
        } else {
            modalFilterBottomSheet.show(
                requireActivity().supportFragmentManager,
                ModalBottomSheet.TAG
            )
        }
    }

    private fun showSortBottomSheet() {
        if (modalSortBottomSheet.isAdded) {
            modalSortBottomSheet.dialog!!.show()
        } else {
            modalSortBottomSheet.show(
                requireActivity().supportFragmentManager,
                ModalBottomSheet.TAG
            )
        }
    }

    private fun setUpComponent() {

        binding.searchBar.setOnQueryTextListener(object: SearchView.OnQueryTextListener{
            override fun onQueryTextSubmit(p0: String?): Boolean {
                binding.bookList.clearOnScrollListeners()
                binding.bookList.adapter=null
                findBookList(binding.searchBar.query.toString(),
                    genreFilter?.id)
                return true
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                if(newText!!.isEmpty()){
                    binding.bookList.clearOnScrollListeners()
                    binding.bookList.adapter=null
                    findBookList(binding.searchBar.query.toString(),
                        genreFilter?.id)

                }
                return false
            }
        })

        binding.btnFilter.setOnClickListener {
            showFilterBottomSheet()
        }

        modalSortBottomSheet = ModalSortBottomSheet(object : SortListener {
            override fun onSortClick(sortType: SortBottomSheetAdapter.SortType) {
                Log.i("Nothing","Sort type:${sortType}")
                when (sortType) {
                    SortBottomSheetAdapter.SortType.Name -> searchViewAdapter.bookList.sortBy { it.name }
                    SortBottomSheetAdapter.SortType.YearPublished -> searchViewAdapter.bookList.sortBy { it.published_year }
                    SortBottomSheetAdapter.SortType.Rating -> searchViewAdapter.bookList.sortBy { it.rating }
                    SortBottomSheetAdapter.SortType.ID->searchViewAdapter.bookList.sortBy { it.id }
                }
                searchViewAdapter.notifyItemRangeChanged(0,searchViewAdapter.itemCount)
            }
        })
        binding.btnSort.setOnClickListener {
            showSortBottomSheet()
        }

        binding.btnCancel.setOnClickListener {
            mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.Home)
        }
    }

    private fun observe() {
        observeBookList()
        observeLoadMoreBookList()
        observeGenreList()
    }

    private fun observeBookList() {
        searchViewModel.bookList.observe(viewLifecycleOwner) { bookList ->
            binding.progressBar.visibility = View.GONE
            binding.bookList.visibility = View.VISIBLE

            searchViewAdapter = SearchBookViewAdapter(bookList,object: SearchBookListener {
                override fun onBookClick(book: Book) {
                    /*mainViewModel.updateSelectedBook(book)
                    mainViewModel.updateCurrentState(MainViewModel.Companion.CurrentState.DetailBook)*/
                    bookClickHandle(book)
                }

            })
            binding.bookList.adapter = searchViewAdapter
        }


        searchViewModel.length.observe(viewLifecycleOwner) { length ->
            binding.bookList.addOnScrollListener(object :
                PaginationScrollListener(binding.bookList.layoutManager as LinearLayoutManager) {
                override fun loadMoreItem() {
                    searchViewAdapter.addFooterLoading()
                    findMoreBookList(binding.searchBar.query.toString(),
                        genreFilter?.id)
                }

                override fun isLoading(): Boolean {
                    return searchViewAdapter.isLoadingAdd
                }

                override fun isLastPage(): Boolean {
                    return searchViewAdapter.itemCount == length
                }

            })
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

    private fun observeLoadMoreBookList() {
        searchViewModel.loadMoreBookList.observe(viewLifecycleOwner) { bookList ->
            if (bookList != null && bookList.size != 0) {
                val handler = Handler(Looper.getMainLooper())
                val runnable = Runnable {
                    searchViewAdapter.removeFooterLoading()
                    searchViewAdapter.addMoreBook(bookList)
                }

                handler.postDelayed(runnable, 2000)
            }
        }
    }

    private fun findBookList(name:String,genreID:Int?) {
        binding.progressBar.visibility = View.VISIBLE
        binding.bookList.visibility = View.GONE
        searchViewModel.loadBookList(name,genreID, bookSearchLimit, 0)
    }

    private fun findMoreBookList(name:String,genreID:Int?) {
        searchViewModel.loadMoreBookList(name,genreID,
            bookSearchMoreLimit,
            searchViewAdapter.bookList.size - 1
        )
    }

}

class ModalBottomSheet(var genreList: MutableList<Genre>, var listener: FilterListener) :
    BottomSheetDialogFragment() {

    private var binding: FilterBottomSheetBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FilterBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), theme).apply {
            setOnCancelListener {
                dialog!!.hide()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        isCancelable = false
        dialog!!.setCanceledOnTouchOutside(false)

        val outsideView = requireDialog().findViewById<View>(R.id.touch_outside)
        outsideView.setOnTouchListener { v: View?, event: MotionEvent ->
            if (event.action == MotionEvent.ACTION_UP) {
                v?.performClick()
                dialog!!.hide()
            }
            false
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.genreList.adapter = FilterBottomSheetAdapter(genreList, listener)
    }

    companion object {
        const val TAG = "ModalBottomSheet"
    }
}

class ModalSortBottomSheet(var listener: SortListener) :
    BottomSheetDialogFragment() {

    private lateinit var binding: SortBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SortBottomSheetBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return BottomSheetDialog(requireContext(), theme).apply {
            setOnCancelListener {
                dialog!!.hide()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        isCancelable = false
        dialog!!.setCanceledOnTouchOutside(false)

        val outsideView = requireDialog().findViewById<View>(R.id.touch_outside)
        outsideView.setOnTouchListener { v: View?, event: MotionEvent ->
            if (event.action == MotionEvent.ACTION_UP) {
                v?.performClick()
                dialog!!.hide()
            }
            false
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.sortList.adapter = SortBottomSheetAdapter(setUpSortTypeList(), listener)
    }

    companion object {
        const val TAG = "ModalBottomSheet"
    }

    private fun setUpSortTypeList(): MutableList<SortBottomSheetAdapter.SortType> {
        val sortTypeList = mutableListOf<SortBottomSheetAdapter.SortType>()
        sortTypeList.add(SortBottomSheetAdapter.SortType.Name)
        sortTypeList.add(SortBottomSheetAdapter.SortType.YearPublished)
        sortTypeList.add(SortBottomSheetAdapter.SortType.Rating)
        return sortTypeList
    }
}

