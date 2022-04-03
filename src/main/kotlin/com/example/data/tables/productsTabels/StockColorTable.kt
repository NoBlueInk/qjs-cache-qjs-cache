package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.StockColorEntity
import com.example.data.tables.authTables.PermissionsTable.references
import org.ktorm.schema.Table
import org.ktorm.schema.float
import org.ktorm.schema.int
import org.ktorm.schema.long

object StockColorTable :Table<StockColorEntity>("stockcolor") {
    val colorId = int("color_id").bindTo { it.colorId }.primaryKey()
    val stockId = long("stock_id").references(StockTable){it.stockId}.primaryKey()
    val quantity = float("quantity").bindTo { it.quantity }
}