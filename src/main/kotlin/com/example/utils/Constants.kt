
package com.example.utils

object Constants {
    const val STOCKED_DATABASE_URL = "jdbc:mysql://localhost:3306/stocked"
    const val STOCKED_DATABASE_DRIVER = "com.mysql.cj.jdbc.Driver"
    const val STOCKED_DATABASE_USER = "root"
    const val STOCKED_DATABASE_PASSWORD = "123456789ahmad"

    const val SALTED_HASH_ALGORITHM = "SHA1PRNG"


    /**
     * Jwt
     */
    val SECRET = System.getenv("JWT_SECRET") ?: "JWT_SECRET"
    const val ISSUER = "http://127.0.0.1:8080"
    const val AUDIENCE = "http://127.0.0.1:8080/stocked"
    const val REALM = "Access to notes"
    const val REFRESH_TOKEN_EXPIRE_DATE = (365L * 1000L * 60L * 60L * 24L)
}