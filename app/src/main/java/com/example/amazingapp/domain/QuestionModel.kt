package com.example.amazingapp.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.Serializable


@Serializable
@Parcelize
data class QuestionModel(
    val id: String,
    val questionText: String,
    val correctAnswer: String,
    val options: List<String>
) : Parcelable {
    fun isCorrectAnswer(answer: String): Boolean {
        return answer == correctAnswer
    }
}