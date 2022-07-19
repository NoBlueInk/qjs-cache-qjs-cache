package com.example.domin.useCases

import com.example.data.dto.user.UserDto
import com.example.data.repositories.userRepository.UserRepository
import com.example.utils.BaseResponse
import com.example.utils.ResponseMessages

class SignUpUseCase constructor(
    private val userRepository: UserRepository,
) {
    suspend operator fun invoke(user: UserDto): BaseResponse<UserDto> {
        if (
            user.username.isEmpty() ||
            user.userAddress.isEmpty() ||
            user.userPassword.isEmpty() ||
            user.userPhone.isEmpty() ||
            user.userSalt.isEmpty() ||
            user.userRole == 0
        ) {
            return BaseResponse.ErrorResponse(message = ResponseMessages.EmptyField.message) as
                    BaseResponse<UserDto>
        }

        if (userRepository.checkIfUserExistByName(username = user.username)) {
            return BaseResponse.ErrorResponse(message = ResponseMessages.UserAlreadyExist.message)
                    as BaseResponse<User