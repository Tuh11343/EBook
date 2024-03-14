package com.example.ebook.fragment

import android.graphics.Color
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ebook.databinding.FragmentLyricsBinding
import com.example.ebook.viewmodels.SongViewModel


class LyricsFragment(var activity: AppCompatActivity, var viewModel: SongViewModel) : Fragment() {

    private lateinit var binding: FragmentLyricsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLyricsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        observeTotalLyrics()
        observeCurrentLyrics()
        observePositionChanged()
    }


    private fun observePositionChanged(){
        viewModel.positionChanged.observe(activity){
            binding.lyricsTextView.text=viewModel.totalLyrics.value
        }
    }

    private fun observeTotalLyrics() {
        viewModel.totalLyrics.observe(activity) { totalLyrics ->
            Log.i("Test", "Cập nhật toàn bộ lời bài hát")
            binding.lyricsTextView.text = totalLyrics.toString()
        }
    }

    private fun observeCurrentLyrics() {
        viewModel.currentLyric.observe(activity) { currentLyric ->

            binding.lyricsTextView.text = viewModel.totalLyrics.value

            val start = viewModel.start.value!!
            val end = start + currentLyric.length
            val spannableLyrics = SpannableString(viewModel.totalLyrics.value)
            spannableLyrics.setSpan(
                ForegroundColorSpan(Color.RED),
                start,
                end,
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
            )

            binding.lyricsTextView.text = spannableLyrics

            // Tính toán vị trí cuộn
            val scrollY = binding.lyricsTextView.layout.getLineTop(
                binding.lyricsTextView.layout.getLineForOffset(end)
            ) - (binding.scrollView.height - binding.lyricsTextView.lineHeight) / 2
            // Cuộn đến vị trí
            binding.scrollView.smoothScrollTo(0, scrollY)
        }
    }

}