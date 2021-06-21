package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity

interface ProductTransfersMovementEntity : Entity<ProductTransfersMovementEntity> {
    companion object : Entity.Factory<ProductTransfersMovementEntity>()
    val productId: ProductEntity
    val transfersId: Transfers