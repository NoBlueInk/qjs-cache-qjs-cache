package com.example.domin.mapper.userMapper

import com.example.data.dto.user.UserDto
import com.example.data.entities.authEntites.UserEntity

fun UserEntity.toUserDto() = UserDto(
    userId = userId,
    userRole = userRole,
    username = username,
    userPassword = userPassword,
    userAge = userAge,
    userPhone = userPhone,
    userAddress = userAddress,
    userSalt = userSalt
//    userRegister = userRegister.toString()
)