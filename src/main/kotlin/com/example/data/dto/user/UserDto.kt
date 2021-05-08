package com.example.data.dto.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("user_id") val userId: Int,
    @SerialName("user_role") val userRole: Int,
    @SerialName("user_name") val username: String,
    @SerialName("user_password") val userPassword: String,
    @SerialName("user_age") val userAge: Int,
    @SerialName("user_phone") val userPhone: String,
    @Seria