package com.example.amazingapp.presentation.main

import android.util.Log
import com.example.amazingapp.base.BaseViewModel
import com.example.amazingapp.base.CoroutineDispatchers
import com.example.amazingapp.domain.LocationModel
import com.example.amazingapp.domain.NewModel
import timber.log.Timber

class MainViewModel(coroutineDispatchers: CoroutineDispatchers) : BaseViewModel<MainViewEvent>(
    coroutineDispatchers
) {
    fun loadDataNews() {
        val sampleNewsList = listOf(
            NewModel(
                newsId = 1,
                title = "Breaking News: Kotlin 2.0 Released!",
                description = "Kotlin 2.0 introduces exciting new features for Android developers.",
                content = "Kotlin 2.0 is here, bringing enhanced performance, new syntax improvements, and better tooling support.",
                imageUrl = "https://cdnphoto.dantri.com.vn/vqTsxVJHHyDXCnk7csdN5CIPjZo=/thumb_w/1020/2024/12/15/nhom-tho-lan-trang-dem-dam-minh-duoi-song-truc-vot-o-to-roi-cau-dong-nai-1-edited-1734225809089.jpeg",
                publishedDate = "2025-03-07",
                isFeatured = true
            ),
            NewModel(
                newsId = 2,
                title = "Android 15 Announced",
                description = "Google unveils the latest version of Android with AI-driven enhancements.",
                content = "Android 15 is packed with new AI-powered features, improved battery optimization, and more customization options.",
                imageUrl = "https://cdnphoto.dantri.com.vn/vqTsxVJHHyDXCnk7csdN5CIPjZo=/thumb_w/1020/2024/12/15/nhom-tho-lan-trang-dem-dam-minh-duoi-song-truc-vot-o-to-roi-cau-dong-nai-1-edited-1734225809089.jpeg",
                publishedDate = "2025-03-06",
                isFeatured = false
            ),
            NewModel(
                newsId = 3,
                title = "Jetpack Compose Gains Popularity",
                description = "Jetpack Compose is now the preferred way to build modern Android UIs.",
                content = "Google reports that Jetpack Compose adoption has surged, with developers praising its declarative UI approach.",
                imageUrl = "https://cdnphoto.dantri.com.vn/vqTsxVJHHyDXCnk7csdN5CIPjZo=/thumb_w/1020/2024/12/15/nhom-tho-lan-trang-dem-dam-minh-duoi-song-truc-vot-o-to-roi-cau-dong-nai-1-edited-1734225809089.jpeg",
                publishedDate = "2025-03-05",
                isFeatured = true
            ),
            NewModel(
                newsId = 4,
                title = "AI-Powered Chatbots Improve UX",
                description = "AI is revolutionizing the way users interact with apps.",
                content = "With advances in natural language processing, chatbots are becoming more intelligent and useful.",
                imageUrl = "https://cdnphoto.dantri.com.vn/vqTsxVJHHyDXCnk7csdN5CIPjZo=/thumb_w/1020/2024/12/15/nhom-tho-lan-trang-dem-dam-minh-duoi-song-truc-vot-o-to-roi-cau-dong-nai-1-edited-1734225809089.jpeg",
                publishedDate = "2025-03-04",
                isFeatured = false
            )
        )
        postValue(MainViewEvent.OnDataNewSuccess(sampleNewsList))
    }


    fun loadDataLocation() {
        val sampleLocations = listOf(
            LocationModel(
                locationId = 1,
                name = "Paris",
                description = "The city of love and lights, home to the Eiffel Tower.",
                imageUrl = "https://bcp.cdnchinhphu.vn/334894974524682240/2024/7/3/edit-thu-tuc-thanh-lap-cong-ty-o-dong-nai-17200025257602067171420.png",
                totalAttractions = 20,
                unlockedAttractions = 5
            ),
            LocationModel(
                locationId = 2,
                name = "Tokyo",
                description = "A bustling metropolis blending tradition with technology.",
                imageUrl = "https://bcp.cdnchinhphu.vn/334894974524682240/2024/7/3/edit-thu-tuc-thanh-lap-cong-ty-o-dong-nai-17200025257602067171420.png",
                totalAttractions = 30,
                unlockedAttractions = 10
            ),
            LocationModel(
                locationId = 3,
                name = "New York",
                description = "The Big Apple, known for Times Square and Broadway.",
                imageUrl = "https://bcp.cdnchinhphu.vn/334894974524682240/2024/7/3/edit-thu-tuc-thanh-lap-cong-ty-o-dong-nai-17200025257602067171420.png",
                totalAttractions = 25,
                unlockedAttractions = 8
            ),
            LocationModel(
                locationId = 4,
                name = "Sydney",
                description = "Famous for the Sydney Opera House and beautiful beaches.",
                imageUrl = "https://bcp.cdnchinhphu.vn/334894974524682240/2024/7/3/edit-thu-tuc-thanh-lap-cong-ty-o-dong-nai-17200025257602067171420.png",
                totalAttractions = 15,
                unlockedAttractions = 6
            )
        )
        postValue(MainViewEvent.OnDataLocationSuccess(sampleLocations))
    }
}