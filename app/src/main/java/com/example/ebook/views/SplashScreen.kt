package com.example.ebook.views

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        window.insetsController?.hide(WindowInsets.Type.statusBars())
//        window.insetsController?.hide(WindowInsets.Type.navigationBars())

        val handler = Handler(Looper.getMainLooper())

        val runnable = Runnable {

            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }

        val delayMillis: Long = 2000
        handler.postDelayed(runnable, delayMillis)

    }
}

