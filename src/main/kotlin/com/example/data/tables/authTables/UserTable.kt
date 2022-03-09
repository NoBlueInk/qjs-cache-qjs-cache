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
    val userName = varc