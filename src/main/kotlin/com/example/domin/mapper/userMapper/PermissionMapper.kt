
package com.example.domin.mapper.userMapper

import com.example.data.dto.user.PermissionDto
import com.example.data.entities.authEntites.PermissionEntity

fun PermissionEntity.toPermissionDto() =
    PermissionDto(
        permissionId = permissionId,
        permissionName = permissionName,
        permissionDescription = permissionDescription
    )