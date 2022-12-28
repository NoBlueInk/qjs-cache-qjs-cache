package com.example.security

interface HashingService {
    fun generateSaltedHash(value: String, saltedHash: Int = 32): SaltedHash

    fun verify(value:String, saltedHash: SaltedHash):Boolean
}