package com.amangram.photoapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.amangram.photoapp.R
import com.amangram.photoapp.ui.photolist.GalleryFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val isFragmentContainerEmpty = savedInstanceState ==null
        if(isFragmentContainerEmpty){
            supportFragmentManager
                .beginTransaction()
                .add(R.id.container, GalleryFragment.newInstance())
                .commit()
        }
    }
}
