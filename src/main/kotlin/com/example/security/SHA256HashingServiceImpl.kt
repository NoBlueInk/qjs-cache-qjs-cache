package com.example.security

import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils
import java.security.SecureRandom

class SHA256HashingServiceImpl : HashingService {

    override fun generateSaltedHash(value: String, saltedHash: Int): SaltedHash {
        //get Random Salt Number
        val salt = SecureRandom.getInstance("SHA1PRNG").generateSeed(saltedHash)
        // Hex Encoder for Salt
        val saltAsHex = Hex.encodeHexString(salt)
        // Hash SaltAsHex With User Password
        // Now, We Have
        // Hash( Hex(salt) + value)
        val hash = DigestUtils.sha256Hex("$saltAsHex$value")

        return SaltedHash(
            hash = hash,
            salt = saltAsHex
        )
    }

    override fun verify(value: String, saltedHash: SaltedHash): Boolean {
        // is sha256Hex(the salt we gave to the User + Password) == hash
        return DigestUtils.sha256Hex(saltedHash.salt + value) == saltedHash.hash
    }

}