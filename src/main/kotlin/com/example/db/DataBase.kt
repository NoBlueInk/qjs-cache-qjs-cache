package com.example.db

import com.example.data.tables.authTables.RolesTable
import com.example.data.tables.authTables.UserTable
import com.example.data.tables.productsTabels.*
import com.example.data.tables.stockTables.SectionsTable
import org.ktorm.database.Database
import org.ktorm.entity.sequenceOf

val Database.product
    get() = this.sequenceOf(ProductTable)

val Database.categ