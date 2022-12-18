package com.example.routes.userRoute

import com.example.domin.endPoints.UserEndPoint
import com.example.domin.useCases.SignUpUseCase
import com.example.routes.mapper.signupMapper.userRequestToDto
import com.example.routes.mapper.signupMapper.userParameters
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Rou