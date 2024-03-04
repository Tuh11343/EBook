package com.example.ebook.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ebook.databinding.FragmentLyricsBinding


class LyricsFragment : Fragment() {

    private lateinit var binding: FragmentLyricsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentLyricsBinding.inflate(inflater,container,false)
        return binding.root
    }


}