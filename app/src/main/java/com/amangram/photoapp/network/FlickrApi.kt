package com.amangram.photoapp.network

import io.reactivex.Observable
import okhttp3.Interceptor
import retrofit2.http.GET
import java.util.*

private const val API_KEY = "d928374115c12472b9606e7250a6b7f8"
interface FlickrApi {

    @GET("services/rest/?method=flickr.interestingness.gerList"+
    "&api_key=$API_KEY"+
            "&format=json"+
    "&nojsoncallback=1" +
    "&extras=url_s")
    fun fetchData(): Observable<String>

}