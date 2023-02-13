package com.example.utils

sealed class ResponseMessages(val message: String) {
    object IncorrectPasswordORUser