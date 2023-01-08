package com.example.security

import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils
import java.security.SecureRandom

class SHA256HashingServiceImpl : HashingService {

    override fun generateSaltedHash(value: String, saltedHash: Int): SaltedHash {
        //get Random Salt Number
        val salt = SecureRandom.getInstance("SHA1PRNG").generateSeed(saltedHash