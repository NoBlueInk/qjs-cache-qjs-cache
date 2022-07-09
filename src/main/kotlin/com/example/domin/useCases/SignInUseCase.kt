
package com.example.domin.useCases

import com.example.data.dto.user.UserDto
import com.example.data.repositories.userRepository.UserRepository
import com.example.security.SaltedHash
import com.example.utils.BaseResponse
import com.example.utils.ResponseMessages
import com.example.utils.generateToken
import com.example.utils.verifyPassword

class SignInUseCase constructor(
    private val userRepository: UserRepository
){
    suspend operator fun invoke(userName : String, userPassword: String): BaseResponse<UserDto>{
        val userDto = userRepository.getUserByUserName(username = userName)

        if(userName.isEmpty()){
            return BaseResponse.ErrorResponse(message = ResponseMessages.EmptyField.message) as
                    BaseResponse<UserDto>
        }

        if(userDto == null){
            return BaseResponse.ErrorResponse(message = ResponseMessages.NotFoundUser.message) as
                    BaseResponse<UserDto>
        }

        val validationPassword = SaltedHash(hash = userDto.userPassword, salt = userDto.userSalt).verifyPassword(userPassword)

        if(!validationPassword){
           return BaseResponse.ErrorResponse(message = ResponseMessages.IncorrectPassword.message) as
                   BaseResponse<UserDto>
        }

        return BaseResponse.SuccessSignResponse(data = userDto.username.generateToken())
    }
}