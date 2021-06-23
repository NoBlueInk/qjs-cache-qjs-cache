package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity

interface StockWeightEntity : Entity<StockWeightEntity> {
    companion object : Entity.Factory<StockWeightEntity>()

    val stockWeightId: Int
    val stockId: StockEntity
    val weight: String
}