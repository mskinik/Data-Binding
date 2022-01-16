package com.example.databinding

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by mustafasuleymankinik on 16.01.2022
 */

@BindingAdapter("url")
fun ImageView.setPhotoFromUrl(stringUrl:String){
    Picasso.get().load("https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.rockpapershotgun.com%2Fthe-witcher-3-is-most-fun-if-you-ignore-almost-all-of-the-witcher-3&psig=AOvVaw2RE3yOBM9Cvn-hWghOdkyU&ust=1642452538037000&source=images&cd=vfe&ved=0CAgQjRxqFwoTCNDJzdSSt_UCFQAAAAAdAAAAABAQ")
        .placeholder(R.drawable.ic_launcher_background)
        .error(R.drawable.ic_launcher_background)
        .into(this)
}