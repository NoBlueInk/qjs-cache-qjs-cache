package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.ProductEntity
import com.example.data.tables.productsTabels.ProductConditionTable.bindTo
import org.ktorm.schema.*

object ProductTable : Table<ProductEntity>("product") {
    val productId = lon