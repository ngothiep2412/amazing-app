package com.example.amazingapp.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
@Parcelize
data class LocationModel(
    @SerialName("location_id")
    val locationId: Long = 0,

    @SerialName("name")
    val name: String,

    @SerialName("description")
    val description: String,

    @SerialName("image_url")
    val imageUrl: String?,

    @SerialName("total_attraction")
    val totalAttractions: Int,

    @SerialName("unlocked_attractions")
    var unlockedAttractions: Int = 0
) : Parcelable {
    fun getProgressPercentage(): Int {
        return if (totalAttractions > 0) {
            (unlockedAttractions * 100) / totalAttractions
        } else {
            0
        }
    }
}