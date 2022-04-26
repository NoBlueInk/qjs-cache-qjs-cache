package com.example.db

import com.example.data.tables.authTables.RolesTable
import com.example.data.tables.authTables.UserTable
import com.example.data.tables.productsTabels.*
import com.example.data.tables.stockTables.SectionsTable
import org.ktorm.database.Database
import org.ktorm.entity.sequenceOf

val Database.product
    get() = this.sequenceOf(ProductTable)

val Database.category
    get() = this.sequenceOf(CategoryTable)

val Database.color
    get() = this.sequenceOf(ColorTable)

val Database.productCondition
    get() = this.sequenceOf(ProductConditionTable)

val Database.productUnit
    get() = this.sequenceOf(ProductUnitTable)

val Database.stockColor
    get() = this.sequenceOf(StockColorTable)

val Database.stock
    get() = this.sequenceOf(StockTable)

val Database.stockWeight
    get() = this.sequenceOf(StockWeightTable)

val Database.supplier
    get() = this.sequence