package com.example.routes.mapper.signInMapper

import com.example.data.request.auth.UserSignInRequest
import io.ktor.server.application.*
import io.ktor.server.util.*
import io.ktor.util.pipeline.*

fun PipelineContext<*, ApplicationCall>.signInParameters(): UserSignInRequest {
    val use