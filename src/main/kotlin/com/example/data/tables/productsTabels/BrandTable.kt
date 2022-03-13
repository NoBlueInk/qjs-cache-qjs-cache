package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.BrandEntity
import org.ktorm.schema.*

object BrandTable : Table<BrandEntity>("brand") {
    val brandId = int("brand_id").bindTo { it.brandId }.primaryKey()
    val brandName = varchar("brand_name").bindTo { it.brandName }
    val brandCreateAt = datetime("brand_created_at").bindTo { it.brandCreateAt }
}