package com.example.routes.userRoute

import com.example.data.response.AuthResponse
import com.example.domin.endPoints.UserEndPoint
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getSecretInfoRoute() {
    authenticate{
        get(UserEndPoint.Secret.path){
            val principal = call.principal<JWTPrincipal>()
            val userId = principal?.getClaim("userId", String::class)
            call.respond(
                status = HttpStatusCode.OK,
                message = AuthResponse(
                    success = false,
                    token = "",
                    message = "YOUR ID IS $userId"
                )
            )
        }
    }
}