package com.amangram.photoapp.network

import com.amangram.photoapp.model.FlickrResponse
import io.reactivex.Observable
import okhttp3.Interceptor
import retrofit2.http.GET
import java.util.*

private const val API_KEY = "d928374115c12472b9606e7250a6b7f8"
interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.getList"+
            "&api_key=$API_KEY"+
            "&extras=url_s"+
            "&format=json"+
            "&nojsoncallback=1")
    fun fetchData(): Observable<FlickrResponse>

}