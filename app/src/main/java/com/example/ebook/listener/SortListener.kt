package com.example.ebook.listener

import com.example.ebook.adapter.SortBottomSheetAdapter


interface SortListener {

    fun onSortClick(sortType: SortBottomSheetAdapter.SortType)

}