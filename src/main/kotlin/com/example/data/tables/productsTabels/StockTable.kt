package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.StockEntity
import com.example.data.tables.productsTabels.TransfersTypeTable.bindTo
import org.ktorm.schema.*

object StockTable : Table<StockEntity>("stock") {
    val stockId = long("stock_id").bindTo { it.stockId }.primaryKey()
    val produc