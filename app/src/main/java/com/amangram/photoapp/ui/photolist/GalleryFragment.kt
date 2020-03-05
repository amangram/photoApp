package com.amangram.photoapp.ui.photolist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.amangram.photoapp.R
import kotlinx.android.synthetic.main.gallery_fragment.*
import org.koin.androidx.viewmodel.ext.android.viewModel


class GalleryFragment : Fragment() {

    companion object {
        fun newInstance() = GalleryFragment()
    }

    private val galleryViewModel: GalleryViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.gallery_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setPhotoTitle()
    }

    private fun setPhotoTitle() {
        val galleryAdapter = GalleryAdapter {}
        photo_rv.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = galleryAdapter
        }
        galleryViewModel.getPhotos().observe(viewLifecycleOwner, Observer { photos ->
            galleryAdapter.swapData(photos.photos.photo)
        })
    }
}
