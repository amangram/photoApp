package com.amangram.photoapp.model


import android.annotation.SuppressLint
import com.google.gson.annotations.SerializedName
import androidx.annotation.Keep
import kotlinx.android.parcel.Parcelize
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Parcelize
data class FlickrResponse(
    @SerializedName("photos")
    val photos: Photos
) : Parcelable