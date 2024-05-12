package com.example.ebook.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.ebook.fragment.FragmentAuthor
import com.example.ebook.fragment.FragmentDetailBook
import com.example.ebook.fragment.FragmentFavorite
import com.example.ebook.fragment.FragmentHome
import com.example.ebook.fragment.FragmentReadBook
import com.example.ebook.fragment.FragmentSearch
import com.example.ebook.fragment.FragmentSignIn
import com.example.ebook.fragment.FragmentSignUp
import com.example.ebook.fragment.FragmentSubscription
import com.example.ebook.fragment.FragmentUser
import com.example.ebook.fragment.FragmentUserLogin

class MainPageAdapter(
    activity: AppCompatActivity,
    private var mainViewPager: ViewPager2,
) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 11
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> FragmentHome()
            1 -> FragmentReadBook(mainViewPager)
            2 -> FragmentDetailBook()
            3 -> FragmentSearch()
            4 -> FragmentUser()
            5 -> FragmentSubscription()
            6 -> FragmentAuthor()
            7 -> FragmentFavorite()
            8 -> FragmentUserLogin()
            9 -> FragmentSignIn()
            10 -> FragmentSignUp()
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

    fun toFragmentAuthor():Int{
        return 6
    }

    fun toFragmentFavorite():Int{
        return 7
    }

    fun toFragmentUserLogin():Int{
        return 8
    }

    fun toFragmentSignIn():Int{
        return 9
    }

    fun toFragmentSignUp():Int{
        return 10
    }


}