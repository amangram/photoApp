package com.amangram.photoapp.ui.photolist

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.amangram.photoapp.R
import com.amangram.photoapp.model.Photo
import kotlinx.android.synthetic.main.gallery_item.view.*

class GalleryAdapter(private val interaction: (Photo) -> Unit) :
    ListAdapter<Photo, GalleryAdapter.GalleryVH>(
        PhotoDC()
    ) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryVH {
        val inflater = LayoutInflater.from(parent.context)
        return GalleryVH(inflater.inflate(R.layout.gallery_item, parent, false))
    }

    override fun onBindViewHolder(holder: GalleryVH, position: Int) {
        holder.bind(getItem(position))
    }

    fun swapData(data: List<Photo>) {
        submitList(data.toMutableList())
    }

    inner class GalleryVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(item: Photo) {
            itemView.photo_name.text = item.title
        }
    }

    private class PhotoDC : DiffUtil.ItemCallback<Photo>() {
        override fun areItemsTheSame(
            oldItem: Photo,
            newItem: Photo
        ): Boolean {
            TODO(
                "not implemented"
            )
        }

        override fun areContentsTheSame(
            oldItem: Photo,
            newItem: Photo
        ): Boolean {
            TODO(
                "not implemented"
            )
        }
    }
}