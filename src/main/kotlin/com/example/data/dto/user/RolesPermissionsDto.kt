package com.example.data.dto.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RolesPermissionsDto(
    @SerialName("role") val role: RoleDto,
    @SerialName("permission") val permission: P