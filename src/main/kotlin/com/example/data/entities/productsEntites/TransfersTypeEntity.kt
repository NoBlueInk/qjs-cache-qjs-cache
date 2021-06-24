package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.time.Instant
import java.time.LocalDateTime

interface TransfersTypeEntity : Entity<TransfersTypeEntity> {
    companion object : Entity.Factory<TransfersTypeEntity>()

    val transferTypeId: Int
    val transfersName: String
    val transfersCreated: LocalDateTime?
}