package com.example.data.dto.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("user_id") val userId: Int,
    @SerialName("user_role") val userRole: Int,
    @SerialName("user_name") va