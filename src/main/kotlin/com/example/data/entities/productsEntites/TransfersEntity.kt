
package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.sql.Timestamp
import java.time.Instant
import java.time.LocalDateTime

interface TransfersEntity : Entity<TransfersEntity> {
    companion object : Entity.Factory<TransfersEntity>()
    val transferId: Int
    val stockConditionId: ProductConditionEntity
    val transferTypeId: TransfersTypeEntity
    val quantity: Float
    val transferMovementCreated: LocalDateTime?
}