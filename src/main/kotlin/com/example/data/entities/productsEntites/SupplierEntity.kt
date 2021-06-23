
package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.sql.Timestamp
import java.time.Instant
import java.time.LocalDateTime

interface SupplierEntity : Entity<SupplierEntity> {
    companion object : Entity.Factory<SupplierEntity>()

    val supplierId: Int
    val supplierName: String
    val supplierCreateAt: LocalDateTime?
}