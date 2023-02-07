package com.example.token

import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import java.util.*

class JwtTokenServiceImpl: TokenService {
    override fun generate(config: TokenConfig, vararg claims: Token): String {
        var token = JWT.create()
            .withAudience(config.audience)
            .withIssuer(config.issuer)
            .withExpiresAt(Date(System.currentTimeMillis()+config.expiresIn))

        claims.forEach { claims->
            token = token.withClaim(claims.name,claims.value)
        }
        return token.sign(Algorithm.HMAC256(config.secret))
    }

}