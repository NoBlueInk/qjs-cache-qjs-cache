package com.example.plugins.routing

import com.example.routes.userRoute.*
import com.example.security.SHA256HashingServiceImpl
import com.example.token.JwtTokenServiceImpl
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.userConfigRouting() {
    routing {
        getSecretInfoRoute()
        signUpRoute()
        signInRoute()
        authenticateRoute()
//        deleteUserRoute(useRepository, hashingService)
//        updatePasswordRoute(useRepository, hashingService, tokenService, tokenConfig)
    }
}
