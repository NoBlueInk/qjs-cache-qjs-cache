package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity

interface WarehousesEntity : Entity<WarehousesEntity> {
    companion object : Entity.Factory<WarehousesEntity>()

    val warehouseId: Int
    