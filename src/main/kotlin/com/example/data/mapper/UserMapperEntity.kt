package com.example.data.mapper

import com.example.data.dto.user.UserDto
import com.example.data.entities.authEntites.UserEntity
import com.example.utils.stringToLocalDateTime

fun UserDto.toUserEntity() =
    UserEntity {
        userId = this@toUserEntity.userId
        userRole = this@toUserEntity.userRole
        username = this@toUserEntity.username
        us