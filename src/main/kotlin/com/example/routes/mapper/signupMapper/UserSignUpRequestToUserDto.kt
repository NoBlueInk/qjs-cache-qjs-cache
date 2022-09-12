
package com.example.routes.mapper.signupMapper

import com.example.data.dto.user.UserDto
import com.example.data.request.auth.UserRegisterRequest
import com.example.utils.generateSaltedHash

fun UserRegisterRequest.userRequestToDto(): UserDto {
    val saltedHash = password.generateSaltedHash()
    return UserDto(
        userId = 0,
        userRole = userRole,
        username = username,
        userPassword = saltedHash.hash,
        userAge = userAge,
        userPhone = userPhone,
        userAddress = userAddress,
        userSalt = saltedHash.salt
    )
}