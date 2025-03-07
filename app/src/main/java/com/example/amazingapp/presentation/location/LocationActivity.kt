package com.example.amazingapp.presentation.location

import android.view.LayoutInflater
import com.example.amazingapp.base.ViewBindingActivity
import com.example.amazingapp.databinding.ActivityLocationBinding

class LocationActivity : ViewBindingActivity<ActivityLocationBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityLocationBinding
        get() = ActivityLocationBinding::inflate

    override fun setup() {

    }
}