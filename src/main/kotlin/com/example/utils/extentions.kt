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
import org.ktorm.schema.Col