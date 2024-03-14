package com.example.ebook.fragment

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.LinearInterpolator
import android.widget.SeekBar
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ebook.R
import com.example.ebook.databinding.FragmentMainBinding
import com.example.ebook.model.Lyric
import com.example.ebook.viewmodels.SongViewModel
import java.io.BufferedReader
import java.io.InputStreamReader

class MainFragment(var activity: AppCompatActivity, var viewModel: SongViewModel) : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var mediaPlayer: MediaPlayer
    private var isPlaying = false
    private var canPlay = false
    private var handler = Handler(Looper.getMainLooper())
    private var animatorSet = AnimatorSet()
    private var rotation: Float = 0.0f

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Set up animation

        setUpSong()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }


    private fun setUpSong() {

        loadSong()
        binding.btnPlay.setOnClickListener {
            btnPlayClick()
            Log.i("Nothing", "Play song")
        }

        binding.btnFastForward.setOnClickListener {
            btnFFClick(1000)
        }

        binding.btnRewind.setOnClickListener {
            btnRewindClick(1000)
        }

    }

    private fun loadLyrics() {
        var lyricsList = mutableListOf<Lyric>()
        val inputStream =
            resources.openRawResource(R.raw.test) // assuming your lyrics file is in the raw folder
        val reader = BufferedReader(InputStreamReader(inputStream))
        var line: String? = reader.readLine()
        while (line != null) {

            val timeString: String = line.substring(line.indexOf("[") + 1, line.indexOf("]"))
            val text: String = line.substring(line.indexOf("]") + 1).trim()
            val time = parseTimeToMillis(timeString)

            lyricsList.add(Lyric(time, text))
            line = reader.readLine()
        }
        reader.close()

        //Update lyric List
        viewModel.updateLyricList(lyricsList)

        //Update total Lyrics
        val lyricsBuilder = StringBuilder()
        for (lyric in lyricsList) {
            lyricsBuilder.append("${lyric.content}\n")
        }
        viewModel.updateTotalLyrics(lyricsBuilder.toString())

    }


    private fun parseTimeToMillis(time: String): Long {
        val minutes = time.substring(0, 2).toLong()
        val seconds = time.substring(3, 5).toLong()
        val millis = time.substring(6, 8).toLong() * 10 // convert centiseconds to milliseconds
        return (minutes * 60 + seconds) * 1000 + millis
    }


    /*fun printLyrics() {
        lyricsList.forEach { lyric ->
            println("[${lyric.time} ms]: ${lyric.content}")
        }
    }*/


    private fun loadSong() {
        mediaPlayer = MediaPlayer()
        mediaPlayer?.setDataSource("https://voicereplay-backgroundmusics.s3.ap-southeast-1.amazonaws.com/media/Believer+-+Imagine+Dragons.mp3")
        mediaPlayer?.setOnPreparedListener {
            binding.seekBar.max = mediaPlayer.duration
            binding.totalTime.text = formatDuration(mediaPlayer.duration.toLong())
            Log.i("Nothing", "Du lieu:${formatDuration(mediaPlayer.duration.toLong())}")
            canPlay = true
            loadLyrics()
            setUpProgressBar()
        }
        mediaPlayer?.prepareAsync()
    }

    private fun startAnimation() {
        val animator = ObjectAnimator.ofFloat(binding.songImg, "rotation", rotation, rotation + 360)
        animator.duration = 10000
        animator.interpolator = LinearInterpolator()
        animator.repeatCount = Animation.INFINITE
        animatorSet.play(animator)
        animatorSet.start()
    }

    private fun pauseAnimation() {
        rotation = binding.songImg.rotation
        animatorSet.cancel()
    }

    private fun btnPlayClick() {
        if (canPlay) {
            if (isPlaying) {
                pauseAnimation()
                stopSeekBar()
                binding.btnPlay.setImageResource(R.drawable.icon_play)
                mediaPlayer.pause()
                isPlaying = false
            } else {
                startAnimation()
                updateSeekBar()
                binding.btnPlay.setImageResource(R.drawable.icon_pause)
                mediaPlayer.start()
                isPlaying = true
            }
        }
    }

    private fun updateSeekBar() {
        val updateSeekBar = object : Runnable {
            override fun run() {

                updateCurrentTime()

                val currentTime = mediaPlayer?.currentPosition?.toLong()
                val lyricList = viewModel.lyricList.value!!
                for (i in 0 until lyricList.size - 1) {
                    val currentKey = lyricList[i].time
                    val nextKey = lyricList[i + 1].time
                    if (nextKey != null) {
                        if (currentTime!! >= currentKey && currentTime < nextKey) {
                            if (viewModel.currentLyric.value != lyricList[i].content) {
                                var start = 0
                                for ((index, lyric) in lyricList.withIndex()) {
                                    if (lyric.time < currentTime) {
                                        start += lyric.content.length + 1
                                        Log.i("Test", "Time+:${lyric.time}")
                                    } else {
                                        Log.i("Test", "StartProgress:${start}")
                                        if (index >= 1)
                                            start -= lyricList[index - 1].content.length + 1
                                        break
                                    }
                                }
                                viewModel.updateStart(start)
                                viewModel.updateLyric(lyricList[i].content)

                            }
                        }
                    }
                }

                handler.postDelayed(this, 500) // Cập nhật mỗi giây
            }
        }
        handler.post(updateSeekBar)
    }

    private fun stopSeekBar() {
        handler.removeCallbacksAndMessages(null)
    }


    private fun btnRewindClick(time: Int) {
        mediaPlayer.seekTo(mediaPlayer.currentPosition - time)
        updateCurrentTime()
        viewModel.updatePositionChanged()
    }

    private fun btnFFClick(time: Int) {
        mediaPlayer.seekTo(mediaPlayer.currentPosition + time)
        updateCurrentTime()
        viewModel.updatePositionChanged()
    }

    private fun updateCurrentTime() {
        binding.seekBar.progress = mediaPlayer.currentPosition
        binding.currentTime.text = formatDuration(mediaPlayer.currentPosition.toLong())
    }

    private fun formatDuration(durationInMillis: Long): String {
        val seconds = durationInMillis / 1000
        val minutes = seconds / 60
        val remainingSeconds = seconds % 60

        return String.format("%02d:%02d", minutes, remainingSeconds)
    }

    private fun setUpProgressBar() {
        binding.seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                if (fromUser) {
                    // Nếu giá trị thay đổi do người dùng, cập nhật thời lượng của bài hát
                    mediaPlayer.seekTo(progress)
                    updateCurrentTime()
                    viewModel.updatePositionChanged()
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}

            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })
    }
}