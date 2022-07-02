package com.example.domin.mapper.userMapper

import com.example.data.dto.user.RoleDto
import com.example.data.entities.authEntites.RoleEntity

fun RoleEntity.toRoleDto() =
    RoleDto(
        rolesId = rolesId,
        