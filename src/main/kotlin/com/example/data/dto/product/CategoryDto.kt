package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CategoryDto(
    @SerialName("category_id") val categoryId: Int,
    @SerialName("category_name") val categoryName: String
)