package com.example.ebook.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.ebook.adapter.ReadBookPageAdapter
import com.example.ebook.databinding.SongBinding



class ReadBookFragment(
    private var mainViewPager: ViewPager2,
) : Fragment() {

    private lateinit var binding: SongBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var songViewModel: SongViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setUpSong()
        setUpIndicator()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        binding = SongBinding.inflate(inflater, container, false)
        return binding.root
    }


    private fun setUpSong() {
        viewPager = binding.viewPager

        songViewModel = ViewModelProvider(requireActivity())[SongViewModel::class.java]
        var viewPageAdapter = ReadBookPageAdapter(requireActivity() as AppCompatActivity,mainViewPager)
        viewPager.adapter = viewPageAdapter
    }

    private fun setUpIndicator() {
        binding.dotsIndicator.attachTo(viewPager)
        binding.fragmentTitle.setInAnimation(activity, android.R.anim.slide_in_left)
        binding.fragmentTitle.setOutAnimation(activity, android.R.anim.slide_out_right)
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if (position == 0) {
                    binding.fragmentTitle.setText("Music")
                } else if (position == 1) {
                    binding.fragmentTitle.setText("Lyrics")
                }
            }
        })
    }
}


