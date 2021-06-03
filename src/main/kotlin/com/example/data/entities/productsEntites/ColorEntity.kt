package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity

interface ColorEntity : Entity<ColorEntity> {
    companion object : Entity.Factory<ColorEntity>()

    val colorId: Int