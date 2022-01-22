package com.example.databinding

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by mustafasuleymankinik on 16.01.2022
 */

@BindingAdapter("url")
fun ImageView.setPhotoFromUrl(stringUrl:String?){
    stringUrl?.let {
        Picasso.get().load(stringUrl)
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_background)
            .into(this)
    }

}