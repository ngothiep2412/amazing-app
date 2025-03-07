package com.example.amazingapp.domain

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Attraction(
    val id: String,
    val locationId: String,
    val name: String,
    val description: String,
    val imageUrl: String,
    var isUnlocked: Boolean = false,
    val question: QuestionModel
)
