package com.example.plugins.routing

import com.example.routes.userRoute.*
import com.example.security.SHA256HashingServiceImpl
import com.example.token.JwtTokenServiceImpl
import io.ktor.server.routing.*
import io.ktor.server.application.*

fun Application.userConfigR