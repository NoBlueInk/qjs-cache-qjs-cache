package com.example.data.response

import kotlinx.serialization.Serializable

@Serializable
data class AuthResponse(
    val success: Boolean,
    val token:String? = "",
    val message:String? = ""
)