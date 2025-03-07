package com.example.amazingapp.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.example.amazingapp.R


fun ImageView.loadImage(url: String?, placeHolder: Int = R.color.gray, radius: Int = 20) {
    Glide.with(this)
        .load(url.orEmpty())
        .timeout(30_000)
        .transition(DrawableTransitionOptions.withCrossFade())
        .apply(RequestOptions().transform(RoundedCorners(radius)))
        .into(this)
}
