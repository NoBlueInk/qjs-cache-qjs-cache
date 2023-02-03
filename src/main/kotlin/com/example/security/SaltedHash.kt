package com.example.security

data class SaltedHash(
    val hash: String,
    val salt: String,
)