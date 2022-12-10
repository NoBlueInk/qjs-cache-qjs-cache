
package com.example.routes.userRoute

import com.example.domin.endPoints.UserEndPoint
import com.example.domin.useCases.SignInUseCase
import com.example.routes.mapper.signInMapper.signInParameters
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.signInRoute() {
    val userUserCase by inject<SignInUseCase>()
    get(UserEndPoint.SignIn.path) {
        val signInParameters = signInParameters()
        val signInToken = userUserCase(signInParameters.username, signInParameters.password)
        call.respond(message = signInToken, status = signInToken.statuesCode)
    }
}