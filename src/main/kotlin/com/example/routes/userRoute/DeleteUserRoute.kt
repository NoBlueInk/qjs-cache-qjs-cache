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

fun Route