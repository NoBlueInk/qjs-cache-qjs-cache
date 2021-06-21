
package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity

interface StockColorEntity : Entity<StockColorEntity> {
    companion object : Entity.Factory<StockColorEntity>()

    val colorId: Int
    val stockId: StockEntity
    val quantity: Float
}