package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.CategoryEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object CategoryTable: Table<CategoryEntity>("category") {
    val categoryId = int("catego