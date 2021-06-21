
package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.time.Instant
import java.time.LocalDateTime

interface StockEntity : Entity<StockEntity> {
    companion object : Entity.Factory<StockEntity>()

    val stockId: Long
    val productId: ProductEntity
    val warehouseId: WarehousesEntity
    val quantityInHand: Float
    val productCreated: LocalDateTime?
}