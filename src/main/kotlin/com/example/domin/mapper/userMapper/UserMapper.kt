package com.example.domin.mapper.userMapper

import com.example.data.dto.user.UserDto
import com.example.data.entities.authEntites.UserEntity

fun UserEntity.toUserDto() = UserDto(
    us