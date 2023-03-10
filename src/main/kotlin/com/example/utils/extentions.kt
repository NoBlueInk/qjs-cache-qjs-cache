package com.example.utils


import com.auth0.jwt.JWT
import com.auth0.jwt.algorithms.Algorithm
import com.example.security.SaltedHash
import com.example.token.Token
import com.example.utils.Constants.AUDIENCE
import com.example.utils.Constants.ISSUER
import com.example.utils.Constants.REFRESH_TOKEN_EXPIRE_DATE
import com.example.utils.Constants.SALTED_HASH_ALGORITHM
import com.example.utils.Constants.SECRET
import org.apache.commons.codec.binary.Hex
import org.apache.commons.codec.digest.DigestUtils
import org.ktorm.database.Database
import org.ktorm.dsl.*
import org.ktorm.schema.Column
import java.security.SecureRandom
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*

fun Database.checkIfExistByName(columnName: Column<String>, name: String): Boolean {
    return this.from(columnName.table).select().where { columnName eq name }.map {}.isNotEmpty()
}

fun String.stringToLocalDateTime(): LocalDateTime {
    return LocalDateTime.parse(this, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
}

fun String.generateSaltedHash(): SaltedHash {
    // Get Random Salt Number
    val salt = SecureRandom.getInstance(SALTED_HASH_ALGORITHM).generateSeed(32)
    // Hex Encoder for Salt
    val saltAsHex = Hex.encodeHexString(salt)
    // Hash SaltAsHex With User Password
    // Now, We Have
    // Hash( Hex(salt) + value)
    val hash = DigestUtils.sha256Hex("$saltAsHex$this")
    retu