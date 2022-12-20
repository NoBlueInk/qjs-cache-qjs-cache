
package com.example.routes

import com.example.data.repositories.userRepository.UserRepository
import com.example.security.HashingService
import com.example.token.TokenConfig
import com.example.token.TokenService
import io.ktor.server.routing.*

fun Route.updatePasswordRoute(
    userDataSource: UserRepository,
    hashingService: HashingService,
    tokenService: TokenService,
    tokenConfig: TokenConfig
){
//    post(AuthenticationEndPoint.UpdatePassword.path){
//        val request = call.receiveOrNull<UpdateUserPasswordRequest>() ?: kotlin.run {
//            call.respond(HttpStatusCode.BadRequest)
//            return@post
//        }
//
//        val areFieldsBlank = request.password.isBlank() || request.username.isBlank() || request.newPassword.isBlank()
//        val isPwTooShort = request.password.length < 8 || request.newPassword.length < 8
//
//        if(areFieldsBlank || isPwTooShort) {
//            call.respond(HttpStatusCode.Conflict)
//            return@post
//        }
//
//        val user = userDataSource.getUserByUserName(request.username)
//
//        if(user == null) {
//            call.respond(
//                HttpStatusCode.Conflict,
//                message = AuthResponse(
//                    success = false,
//                    token = "",
//                    message = "INCORRECT USERNAME OR PASSWORD"
//                )
//            )
//            return@post
//        }
//
//        val isValidPassword = hashingService.verify(
//            value = request.password,
//            saltedHash = SaltedHash(
//                hash = user.userPassword,
//                salt = user.userSalt
//            )
//        )
//
//        if(!isValidPassword) {
//            println("Entered hash: ${DigestUtils.sha256Hex("${user.userSalt}${request.password}")}, Hashed PW: ${user.userPassword}")
//            call.respond(
//                HttpStatusCode.Conflict,
//                message = AuthResponse(
//                    success = false,
//                    token = "",
//                    message = "INCORRECT PASSWORD"
//                )
//            )
//            return@post
//        }
//
//        val saltedHash = hashingService.generateSaltedHash(value = request.newPassword)
//
//        val userCopy = user.copy(
//            userPassword = saltedHash.hash,
//            userSalt = saltedHash.salt
//        )
//
//        val updateUser = userDataSource.updateUserPassword(userCopy)
//
//        if(!updateUser)
//        {
//            call.respond(
//                status = HttpStatusCode.Conflict,
//                message = AuthResponse(
//                    success = false,
//                    token = "",
//                    message = "FAILED UPDATE USER"
//                )
//            )
//            return@post
//        }
//
//        val token = tokenService.generate(
//            config = tokenConfig,
//            Token(
//                name = "userId",
//                value = user.userId.toString()
//            )
//        )
//
//        call.respond(
//            status = HttpStatusCode.OK,
//            message = AuthResponse(
//                success = true,
//                token = token,
//                message = "SUCCESS UPDATE USER"