package com.example.utils

sealed class ResponseMessages(val message: String) {
    object IncorrectPasswordORUserName : ResponseMessages("INCORRECT USERNAME OR PASSWORD")
    object EmptyField : ResponseMessages("EMPTY FILED")
    object IncorrectPassword : ResponseMessages("INCORRECT PASSWORD")
    object SuccessSignIn : ResponseMessages("SUCCESS SIGN IN")
    object IncorrectRequest : ResponseMessages("INCORRECT REQUEST")
    object U