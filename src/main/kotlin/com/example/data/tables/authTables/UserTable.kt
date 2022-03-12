package com.example.data.tables.authTables

import com.example.data.entities.authEntites.UserEntity
import com.example.data.tables.productsTabels.ProductTable.bindTo
import kotlinx.serialization.SerialName
import org.ktorm.schema.Table
import org.ktorm.schema.datetime
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object UserTable : Table<UserEntity>("users") {
    val userId = int("user_id").bindTo { it.userId }.primaryKey()
    val userRole = int("user_role").bindTo { it.userRole }
    val userName = varchar("user_name").bindTo { it.username }
    val userPassword = varchar("user_password").bindTo { it.userPassword }
    val userAge = int("user_age").bindTo { it.userAge }
    val userPhone = varchar("user_phone").bindTo { it.userPhone }
    val userAddress = varchar("user_address").bindTo { it.userAddress }
    val userSalt = varchar("user_salt").bindTo { it.userSalt }
//    val userRegister = datetime("user_register").bindTo { it.userRegister }
}