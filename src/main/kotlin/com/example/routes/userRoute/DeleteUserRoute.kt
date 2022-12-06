package com.example.routes.userRoute

import com.example.data.request.auth.UserRegisterRequest
import com.example.data.response.AuthResponse
import com.example.domin.endPoints.UserEndPoint
import com.example.data.repositories.userRepository.UserRepository
import com.example.security.HashingService
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.deleteUserRoute(
    userDataSource: UserRepository,
    hashingService: HashingService,
) {
    post(UserEndPoint.DeleteUserByUsernameAndPassword.path) {

        val request = call.receiveOrNull<UserRegisterRequest>() ?: kotlin.run {
            call.respond(HttpStatusCode.BadRequest)
            return@post
        }

        val areFieldsBlank = request.password.isBlank() || request.username.isBlank()
        val isPwTooShort = request.password.length < 8

        if (areFieldsBlank || isPwTooShort) {
            call.respond(HttpStatusCode.BadGateway)
            return@post
        }

//        val user = userDataSource.getUserByUserName(request.username)

//        if (user == null) {
//            call.respond(
//                HttpStatusCode.ExpectationFailed,
//                message = AuthResponse(
//                    success = false,
//                    token = "",
//                    message = "CAN'T FOUND USER INCORRECT USERNAME OR PASSWORD"
//                )
//            )
//            return@post
//        }

//        val isValidPassword = hashingService.verify(
//            value = request.password,
//            saltedHash = SaltedHash(
//                hash = user.userPassword,
//                salt = user.userSalt
//            )
//        )

//        if (!isValidPassword) {
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

        val deleteUser = userDataSource.deleteUser(request.username)

        if (!deleteUser) {
            call.respond(
                status = HttpStatusCode.Conflict,
                message = AuthResponse(
                    success = false,
                    token = "",
                    message = "FAILED DELETE USER"
                )
            )
            return@post
        }

        call.respond(
            status = HttpStatusCode.OK,
            message = AuthResponse(
                success = true,
                token = "",
                message = "SUCCESS DELETE USER"
            )
        )
    }
}