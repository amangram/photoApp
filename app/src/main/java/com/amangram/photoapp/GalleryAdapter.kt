package com.amangram.photoapp

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.View.OnClickListener
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter

class GalleryAdapter(private val interaction: (String) -> Unit) :
    ListAdapter<String, GalleryAdapter.GalleryVH>(StringDC()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryVH {
        val inflater = LayoutInflater.from(parent.context)
        return GalleryVH(inflater.inflate(R.layout.gallery_item, parent, false))
    }

    override fun onBindViewHolder(holder: GalleryVH, position: Int) {
        holder.bind(getItem(position))
    }

    fun swapData(data: List<String>) {
        submitList(data.toMutableList())
    }

    inner class GalleryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: String) {
            // TODO: Bind the data with View
        }
    }

    private class StringDC : DiffUtil.ItemCallback<String>() {
        override fun areItemsTheSame(
            oldItem: String,
            newItem: String
        ): Boolean {
            TODO(
                "not implemented"
            )
        }

        override fun areContentsTheSame(
            oldItem: String,
            newItem: String
        ): Boolean {
            TODO(
                "not implemented"
            )
        }
    }
}