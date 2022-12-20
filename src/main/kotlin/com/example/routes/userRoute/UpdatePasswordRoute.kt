
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