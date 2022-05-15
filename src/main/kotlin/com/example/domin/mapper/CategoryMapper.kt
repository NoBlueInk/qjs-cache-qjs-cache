
package com.example.domin.mapper

import com.example.data.dto.product.CategoryDto
import com.example.data.entities.productsEntites.CategoryEntity

fun CategoryEntity.toCategoryDto() = CategoryDto(
    categoryId = categoryId,
    categoryName = categoryName
)