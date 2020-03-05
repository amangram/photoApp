package com.amangram.photoapp.di

import com.amangram.photoapp.ui.photolist.GalleryViewModel
import com.amangram.photoapp.network.FlickrApi
import com.amangram.photoapp.network.RetrofitService
import com.amangram.photoapp.repository.FlickrRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single { RetrofitService.buildService(FlickrApi::class.java) }
    single { FlickrRepository(get()) }
    viewModel { GalleryViewModel(get()) }
}