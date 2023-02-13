package com.example.utils

sealed class ResponseMessages(val message: String) {
    object IncorrectPasswordORUserName : ResponseMessages("INCORRECT USERNAME OR PASSWORD")
    object Em