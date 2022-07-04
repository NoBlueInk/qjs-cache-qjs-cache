package com.example.domin.mapper.userMapper

import com.example.data.dto.user.RolesPermissionsDto
import com.example.data.entities.authEntites.RolesPermissionsEntity

fun RolesPermissionsEntity.toRolesPermissionsDto() =
    RolesPermissionsDto(
        role = role.toRoleDto(),
        permission = permission.toPermissionDto()
    )