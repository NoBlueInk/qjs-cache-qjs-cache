package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.BrandEntity
import org.ktorm.schema.*

object BrandTable : Table<BrandEntity>("brand") {
    val b