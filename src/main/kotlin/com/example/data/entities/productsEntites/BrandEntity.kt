package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity
import java.time.Instant
import java.time.LocalDateTime

interface BrandEntity : Entity<BrandEntity> {
    companion object : Entity.Factory<BrandEntity>()

    val brandId: Int
    val brandName: String
    val brandCreateAt: LocalDateTime?
}