package com.example.data.entities.productsEntites

import org.ktorm.entity.Entity

interface CategoryEntity : Entity<CategoryEntity> {
    companion object : Entity.Factory<CategoryEntity>()

    val categoryId: Int
    val categoryName: String
}