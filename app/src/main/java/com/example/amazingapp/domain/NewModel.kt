package com.example.amazingapp.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class NewModel(
    @SerialName("news_id")
    val newsId: Long = 0,

    @SerialName("title")
    val title: String,

    @SerialName("description")
    val description: String,

    @SerialName("content")
    val content: String,

    @SerialName("image_url")
    val imageUrl: String?,

    @SerialName("published_date")
    val publishedDate: String,

    @SerialName("is_featured")
    val isFeatured: Boolean = false
)