package com.example.ebook.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainPageAdapter(activity: AppCompatActivity,
                      private var mainViewPager: ViewPager2,
) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 6
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentHome()
            1 -> ReadBookFragment(mainViewPager)
            2 -> FragmentDetailBook()
            3 -> FragmentSearch()
            4 -> FragmentUser()
            5 -> FragmentSubscription()
            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    fun toHomeFragment(): Int {
        return 0
    }

    fun toReadBookFragment(): Int {
        return 1
    }

    fun toFragmentDetailBook(): Int {
        return 2
    }

    fun toFragmentSearch(): Int {
        return 3
    }

    fun toFragmentUser():Int{
        return 4
    }

    fun toFragmentSubscription():Int{
        return 5
    }

}