
package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.StockWeightEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.long
import org.ktorm.schema.varchar

object StockWeightTable: Table<StockWeightEntity>("stockweight") {
    val stockWeightId = int("stock_weight_id").bindTo { it.stockWeightId }.primaryKey()
    val stockId = long("stock_id").references(StockTable){it.stockId}.primaryKey()
    val weight = varchar("weight").bindTo { it.weight }
}