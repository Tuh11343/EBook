package com.example.ebook.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ebook.R
import com.example.ebook.databinding.BookviewContinueBinding
import com.example.ebook.listener.IBookListener
import com.example.ebook.model.Book

class ContinueBookAdapter(private var bookList: MutableList<Book>, var mListener: IBookListener) :
    RecyclerView.Adapter<ContinueBookAdapter.BookViewHolder>() {

    inner class BookViewHolder(val binding: BookviewContinueBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            BookviewContinueBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[holder.absoluteAdapterPosition]
        if (book != null) {
            Glide.with(holder.itemView.context)
                .load(book.image)
                .placeholder(R.drawable.song_circle)
                .error(R.drawable.song_circle)
                .centerCrop()
                .into(holder.binding.bookImg)

            holder.binding.bookName.text = book.name
            holder.binding.btnPlay.setOnClickListener {
                mListener.onBookClick(book)
            }

        }
    }

}