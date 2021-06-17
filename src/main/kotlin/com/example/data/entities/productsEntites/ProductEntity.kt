package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.text.DateFormat
import java.time.Instant
import java.time.LocalDateTime
import java.util.Date

interface ProductEntity : Entity<ProductEntity> {
    companion object : Entity.Factory<ProductEntity>()

    val productId: Long
    val itemName: String
    val productCode: String
    val itemImage: String
    val itemPrice: Float
    val itemCreateAt: LocalDateTime?
    val brandId: BrandEntity
    val supplierId: SupplierEntity
    val categoryId: CategoryEntity
    val unitId: ProductUnitEntity
}