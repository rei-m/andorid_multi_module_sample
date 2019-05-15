package me.reim.multimodulesample.model

import com.squareup.moshi.Json

data class User(
    val id: String,
    @field:Json(name = "profile_image_url") val profileImageUrl: String
)
