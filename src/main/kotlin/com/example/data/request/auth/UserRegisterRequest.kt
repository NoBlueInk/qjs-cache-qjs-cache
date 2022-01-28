package com.example.data.request.auth

data class UserRegisterRequest(
    val userRole: Int,
    val username: String,
    val password: String,
    val userAge: Int