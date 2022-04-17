package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.SupplierEntity
import org.ktorm.schema.*

object SupplierTable: Table<SupplierEntity>("supplier") {
    val supplierId = int("supplier_id").bindTo { it.supplierId }.primaryKey()
    val supplierName = varc