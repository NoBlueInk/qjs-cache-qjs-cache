package com.example.routes.mapper.signupMapper

import com.example.data.request.auth.UserRegisterRequest
import io.ktor.server.application.*
import io.ktor.server.util.*
import io.ktor.util.pipeline.*

fun PipelineContext<*, ApplicationCall>.userParameters(): UserRegisterRequest {
    val userParameters = call.request.queryParameters
    return UserRegisterRequest(
        userRole = userParameters.getOrFail("role").toInt(),
        username = userParameters.getOrFail("name"),
        password = userParameters.getOrFail("password"),
        userAge = userParameters.getOrFail("ag