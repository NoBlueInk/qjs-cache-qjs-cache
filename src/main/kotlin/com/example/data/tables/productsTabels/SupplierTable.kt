package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.SupplierEntity
import org.ktorm.schema.*

object SupplierTable: Table<SupplierEntity>("supplier") {
    val supplierId = int("supplier_id").bindTo { it.supplierId }.primaryKey()
    val supplierName = varchar("supplier_name").bindTo { it.supplierName }
    val supplierCreateAt = datetime("supplier_createdAt").bindTo { it.supplierCreateAt }
}