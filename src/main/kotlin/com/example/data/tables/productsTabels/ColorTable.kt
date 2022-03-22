package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.ColorEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object ColorTable: Table<ColorEntity>("color") {
    val colorId = int("color_id").bindTo { it.colorId }.primaryKey()
    val colorName =varchar("color_name").bindTo { it.colorName }
    val colorHex = varchar("color_hex").bindTo { it.colorHex }
}