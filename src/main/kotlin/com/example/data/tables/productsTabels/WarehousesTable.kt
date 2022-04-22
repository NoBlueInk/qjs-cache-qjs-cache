package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.WarehousesEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object WarehousesTable: Table<WarehousesEntity>("warehouses") {
    val warehouseId = int("warehouse_id").bindTo { it.warehouseId }.primaryKey()
    val warehouseName = varchar("warehouse_name").bindTo { it.warehouseName }
    val siteName = varchar("site_name").bindTo 