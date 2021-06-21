
package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.time.Instant
import java.time.LocalDateTime

interface ProductUnitEntity : Entity<ProductUnitEntity> {
    companion object : Entity.Factory<ProductUnitEntity>()

    val unitId: Int
    val unitName: String
    val unitCreated: LocalDateTime?
}