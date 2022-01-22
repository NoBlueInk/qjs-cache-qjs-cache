
package com.example.data.request.auth

import kotlinx.serialization.Serializable

@Serializable
data class UpdateUserPasswordRequest(
    val username: String,
    val password: String,
    val newPassword: String,
)