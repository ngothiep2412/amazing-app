package com.example.amazingapp.presentation.main

import android.view.LayoutInflater
import com.example.amazingapp.base.ViewBindingActivity
import com.example.amazingapp.databinding.ActivityMainBinding
import com.example.amazingapp.presentation.main.adapter.MainLocationAdapter
import com.example.amazingapp.presentation.main.adapter.MainNewsAdapter
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ViewBindingActivity<ActivityMainBinding>() {

    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    private val viewModel by viewModel<MainViewModel>()

    private val newsAdapter by lazy {
        MainNewsAdapter(
            emptyList()
        )
    }

    private val locationsAdapter by lazy {
        MainLocationAdapter(
            emptyList()
        )
    }

    override fun setup() {
        viewModel.loadDataNews()
        viewModel.loadDataLocation()


        binding.newsRecyclerView.adapter = newsAdapter
        binding.locationsRecyclerView.adapter = locationsAdapter

        viewModel.viewEvent.observe(this) {
            when (it) {
                is MainViewEvent.OnError -> TODO()

                is MainViewEvent.OnDataNewSuccess -> {
                    newsAdapter.updateData(it.news)

                }

                is MainViewEvent.OnDataLocationSuccess -> {
                    locationsAdapter.updateData(it.locations)
                }
            }
        }


    }

    companion object {
        const val TAG = "MainActivity"
    }
}