
package com.example.data.dto.user

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class RoleDto(
    @SerialName("roles_id") val rolesId :Int,
    @SerialName("roles_name") val rolesName:String,
    @SerialName("roles_description") val rolesDescription:String
)