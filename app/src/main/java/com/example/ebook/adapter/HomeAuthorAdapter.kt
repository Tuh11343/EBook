package com.example.ebook.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ebook.R
import com.example.ebook.databinding.HomeAuthorViewBinding
import com.example.ebook.model.Author

class HomeAuthorAdapter(private var authorList: MutableList<Author>) :
    RecyclerView.Adapter<HomeAuthorAdapter.AuthorViewHolder>() {


    inner class AuthorViewHolder(val binding: HomeAuthorViewBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorViewHolder {
        return AuthorViewHolder(
            HomeAuthorViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int {
        return authorList.size
    }

    override fun onBindViewHolder(holder: AuthorViewHolder, position: Int) {
        val author = authorList[holder.absoluteAdapterPosition]
        if (author != null) {
            Glide.with(holder.itemView.context)
                .load(author.image)
                .placeholder(R.drawable.song_circle)
                .error(R.drawable.song_circle)
                .into(holder.binding.authorImg)

            holder.binding.authorName.text = author.name
        }
    }

}