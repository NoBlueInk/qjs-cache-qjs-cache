package com.example.token

interface TokenService {
    fun generate(config: TokenConfig, vararg claims: Token):String
}