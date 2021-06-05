
package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.time.Instant
import java.time.LocalDateTime

interface ProductConditionEntity : Entity<ProductConditionEntity> {
    companion object : Entity.Factory<ProductConditionEntity>()

    val conditionId: Int
    val conditionName: String
    val conditionCreated: LocalDateTime?
}