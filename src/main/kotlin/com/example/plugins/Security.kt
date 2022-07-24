package com.example.plugins

import io.ktor.server.auth.*
import io.ktor.server.auth.jwt.*
import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.example.token.TokenConfig
import io.ktor.server.application.*

fun Application.configureSecurity(config: TokenConfig) {

    authentica