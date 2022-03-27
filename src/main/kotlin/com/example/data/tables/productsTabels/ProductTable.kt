package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.ProductEntity
import com.example.data.tables.productsTabels.ProductConditionTable.bindTo
import org.ktorm.schema.*

object ProductTable : Table<ProductEntity>("product") {
    val productId = long("product_id").bindTo { it.productId }.primaryKey()
    val itemName = varchar("item_name").bindTo { it.itemName }
    val productCode = varchar("product_code").bindTo { it.p