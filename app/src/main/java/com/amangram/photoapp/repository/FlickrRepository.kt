package com.amangram.photoapp.repository

import android.telephony.euicc.DownloadableSubscription
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.amangram.photoapp.model.FlickrResponse
import com.amangram.photoapp.network.FlickrApi
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

class FlickrRepository(private val flickrApi: FlickrApi) {
    private lateinit var subscription: Disposable
    fun getGalleryData(): LiveData<FlickrResponse>    {
        val response = MutableLiveData<FlickrResponse>()
        subscription = flickrApi.fetchData()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                response.postValue(it)
            },{})
        return response
    }
    fun disposeSubscription(){
        subscription.dispose()
    }
}