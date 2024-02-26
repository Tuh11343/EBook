package com.example.ebook.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ebook.databinding.GenreBinding
import com.example.ebook.model.Genre

class GenreAdapter(
    private var genreList: MutableList<Genre>,
) : RecyclerView.Adapter<GenreAdapter.MyViewHolder>() {

    inner class MyViewHolder(val binding: GenreBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = GenreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return genreList.size
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val genre = genreList[holder.absoluteAdapterPosition]
        if (genre != null) {
            holder.binding.id.text=genre.id.toString()
            holder.binding.name.text=genre.name.toString()
        }
    }

    fun updateUI(genreList: MutableList<Genre>){
        this.genreList =genreList
        notifyDataSetChanged()
    }

}