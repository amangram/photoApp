package com.amangram.photoapp.ui.photolist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.amangram.photoapp.model.FlickrResponse
import com.amangram.photoapp.model.Photo
import com.amangram.photoapp.repository.FlickrRepository

class GalleryViewModel(private val flickrRepository: FlickrRepository) : ViewModel() {

    fun getPhotos() = flickrRepository.getGalleryData()
    override fun onCleared() {
        super.onCleared()
        flickrRepository.disposeSubscription()
    }
}
