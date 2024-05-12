package com.example.ebook.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ebook.R
import com.example.ebook.databinding.BookViewBinding
import com.example.ebook.listener.IBookListener
import com.example.ebook.model.Book

class BookWithMultiAdapter(
    var bookList: MutableList<Book>,
    var title: String,
    var mListener: IBookListener
) :
    RecyclerView.Adapter<BookWithMultiAdapter.BookViewHolder>() {

    inner class BookViewHolder(val binding: BookViewBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
        return BookViewHolder(
            BookViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return bookList.size / 2
    }

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        val book = bookList[holder.absoluteAdapterPosition]
        var book2 = Book()
        var book3 = Book()
        var book4 = Book()
        if (holder.absoluteAdapterPosition + 1 < bookList.size) {
            book2 = bookList[holder.absoluteAdapterPosition + 1]
        }
        if (holder.absoluteAdapterPosition + 1 < bookList.size) {
            book3 = bookList[holder.absoluteAdapterPosition + 1]
        }
        if (holder.absoluteAdapterPosition + 3 < bookList.size) {
            book4 = bookList[holder.absoluteAdapterPosition + 3]
        }

        if (book != null) {
            Glide.with(holder.itemView.context)
                .load(book.image)
                .placeholder(R.drawable.song_circle)
                .error(R.drawable.song_circle)
                .into(holder.binding.bookImg)

            holder.binding.bookName.text = title

            holder.binding.bookImg.setOnClickListener {
                val shrinkAnimation =
                    AnimationUtils.loadAnimation(holder.itemView.context, R.anim.shrink_effect)
                shrinkAnimation.setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationStart(animation: Animation?) {
                    }

                    override fun onAnimationEnd(animation: Animation?) {
                        mListener.onBookClick(book)
                    }

                    override fun onAnimationRepeat(animation: Animation?) {
                    }
                })

                holder.binding.cardView.startAnimation(shrinkAnimation)
            }

        }


        /*if(book2!=null){
            Glide.with(holder.itemView.context)
                .load(book2.image)
                .placeholder(R.drawable.song_circle)
                .error(R.drawable.song_circle)
                .into(holder.binding.bookImg2)
            holder.binding.bookName2.text=title
        }*/
        if (book3 != null) {
            Glide.with(holder.itemView.context)
                .load(book3.image)
                .placeholder(R.drawable.song_circle)
                .error(R.drawable.song_circle)
                .into(holder.binding.bookImg3)
            holder.binding.bookName3.text = title


            holder.binding.bookImg3.setOnClickListener {
                val shrinkAnimation =
                    AnimationUtils.loadAnimation(holder.itemView.context, R.anim.shrink_effect)
                shrinkAnimation.setAnimationListener(object : Animation.AnimationListener {
                    override fun onAnimationStart(animation: Animation?) {
                    }

                    override fun onAnimationEnd(animation: Animation?) {
                        mListener.onBookClick(book)
                    }

                    override fun onAnimationRepeat(animation: Animation?) {
                    }
                })

                holder.binding.cardView3.startAnimation(shrinkAnimation)
            }
        }
        /*if(book4!=null){
            Glide.with(holder.itemView.context)
                .load(book4.image)
                .placeholder(R.drawable.song_circle)
                .error(R.drawable.song_circle)
                .into(holder.binding.bookImg4)
            holder.binding.bookName4.text=title
        }*/


    }


}