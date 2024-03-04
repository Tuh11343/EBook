package com.example.ebook.fragment

import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ebook.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var mediaPlayer: MediaPlayer
    private var isPlaying=false
    private var canPlay=false
    private var handler=Handler(Looper.getMainLooper())

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpSong()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }


    private fun setUpSong(){
        loadSong()
        binding.btnPause.setOnClickListener{
            btnPlayClick()
            Log.i("Nothing","Play song")
        }

        binding.btnFF.setOnClickListener{
            btnFFClick(1000)
        }

        binding.btnRewind.setOnClickListener{
            btnRewindClick(1000)
        }

    }

    private fun loadSong(){
        mediaPlayer= MediaPlayer()
        mediaPlayer?.setDataSource("https://assets.mixkit.co/music/preview/mixkit-tech-house-vibes-130.mp3")
        mediaPlayer?.setOnPreparedListener {
            binding.progressBar.max=mediaPlayer.duration
            binding.totalTimeTextView.text=formatDuration(mediaPlayer.duration.toLong())
            Log.i("Nothing","Du lieu:${formatDuration(mediaPlayer.duration.toLong())}")
            canPlay=true
        }
        mediaPlayer?.prepareAsync()
    }

    private fun btnPlayClick(){
        if(canPlay){
            if(isPlaying){
                mediaPlayer.pause()
                isPlaying=false
                stopSeekBar()
            }else{
                mediaPlayer.start()
                isPlaying=true
                updateSeekBar()
            }
        }
    }

    private fun updateSeekBar() {
        val updateSeekBar = object : Runnable {
            override fun run() {

                updateCurrentTime()

                handler.postDelayed(this, 500) // Cập nhật mỗi giây
            }
        }
        handler.postDelayed(updateSeekBar, 0)
    }

    private fun stopSeekBar(){
        handler.removeCallbacksAndMessages(null)
    }


    private fun btnRewindClick(time:Int){
        mediaPlayer.seekTo(mediaPlayer.currentPosition-time)
    }

    private fun btnFFClick(time:Int){
        mediaPlayer.seekTo(mediaPlayer.currentPosition+time)
    }

    private fun updateCurrentTime(){
        binding.progressBar.progress=mediaPlayer.currentPosition
        binding.currentTimeTextView.text=formatDuration(mediaPlayer.currentPosition.toLong())
    }

    private fun formatDuration(durationInMillis: Long): String {
        val seconds = durationInMillis / 1000
        val minutes = seconds / 60
        val remainingSeconds = seconds % 60

        return String.format("%02d:%02d", minutes, remainingSeconds)
    }


}