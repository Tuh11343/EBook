package com.example.ebook.views

import android.graphics.Typeface
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.core.text.HtmlCompat
import com.example.ebook.R
import com.example.ebook.adapter.GenreAdapter
import com.example.ebook.databinding.MainBinding
import com.example.ebook.model.Genre

class Home : ComponentActivity() {
    private lateinit var binding: MainBinding
    private var genreList= mutableListOf<Genre>()
    private lateinit var genreAdapter: GenreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paymentMethod);

// Lấy TextView từ id
        val textView: TextView = findViewById(R.id.title)

// Chuỗi văn bản
        val text = "Nhận 1 sách nói tự chọn mỗi tháng. Lưu giữ trọn đời"

// Tạo một đối tượng SpannableString từ chuỗi văn bản
        val spannableString = SpannableString(text)

// Tìm vị trí của từ "sách nói" trong chuỗi
        val startIndex = text.indexOf("sách nói")

// Nếu tìm thấy từ "sách nói", áp dụng StyleSpan để in đậm
        if (startIndex != -1) {
            val boldSpan = StyleSpan(Typeface.BOLD)
            spannableString.setSpan(boldSpan, startIndex, startIndex + "sách nói".length, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE)
        }

// Hiển thị văn bản với định dạng in đậm trên TextView
        textView.text = spannableString
    }
}