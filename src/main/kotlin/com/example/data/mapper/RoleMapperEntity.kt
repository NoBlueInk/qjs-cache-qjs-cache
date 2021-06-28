package com.example.data.mapper

import com.example.data.dto.user.RoleDto
import com.example.data.entities.authEntites.RoleEntity

fun RoleDto.toRoleEntity() =
    RoleEntity 