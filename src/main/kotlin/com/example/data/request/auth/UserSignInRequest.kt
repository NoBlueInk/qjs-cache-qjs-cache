package com.example.data.request.auth

import kotlinx.serialization.Serializable

@Serializable
data class UserSignInRequest(
    val username :String,
    val password:String
)
