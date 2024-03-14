package com.example.ebook.adapter

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.ebook.fragment.LyricsFragment
import com.example.ebook.fragment.MainFragment
import com.example.ebook.viewmodels.SongViewModel


class ViewPageAdapter(private val activity: AppCompatActivity, private val viewModel: SongViewModel): FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MainFragment(activity,viewModel)
            1 -> LyricsFragment(activity,viewModel)

            else -> throw IllegalArgumentException("Invalid position")
        }
    }

    fun getTitle(position: Int): String {
        return when(position){
            0->"Main"
            1->"Lyrics"
            else->"WTF"
        }
    }


}