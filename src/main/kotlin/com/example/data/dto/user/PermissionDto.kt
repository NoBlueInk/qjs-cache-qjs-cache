package com.example.data.dto.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PermissionDto(
    @SerialName("permission_id") val permissionId: Int,
    @SerialName("permission_name") val permissionName: String,
    @S