package com.example.ebook.views

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager2.widget.ViewPager2
import com.example.ebook.adapter.ViewPageAdapter
import com.example.ebook.databinding.ReadBookBinding
import com.example.ebook.viewmodels.SongViewModel

class ReadBookActivity: AppCompatActivity() {

    private lateinit var songBinding:ReadBookBinding
    private lateinit var viewPager: ViewPager2
    private lateinit var viewModel: SongViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        songBinding=ReadBookBinding.inflate(layoutInflater)

        //Song
        setContentView(songBinding.root)

        setUpSong()
        setUpIndicator()
    }

    private fun setUpSong(){
        /*tabLayout=songBinding.tabLayout*/
        viewPager=songBinding.viewPager

        viewModel= ViewModelProvider(this)[SongViewModel::class.java]
        var viewPageAdapter= ViewPageAdapter(this,viewModel)
        viewPager.adapter=viewPageAdapter

    }

    private fun setUpIndicator(){
        songBinding.dotsIndicator.attachTo(viewPager)
        songBinding.fragmentTitle.setInAnimation(this, android.R.anim.slide_in_left)
        songBinding.fragmentTitle.setOutAnimation(this, android.R.anim.slide_out_right)
        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                if(position==0){
                    songBinding.fragmentTitle.setText("Music")
                }else if(position==1){
                    songBinding.fragmentTitle.setText("Lyrics")
                }
            }
        })
    }


}