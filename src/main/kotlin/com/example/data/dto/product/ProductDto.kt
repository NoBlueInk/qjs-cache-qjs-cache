package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductDto(
    @SerialName("product_id") val productId: Long,
    @SerialName("item_name") val itemName: String,
    @SerialName("product_code") val productCode: String,
    @SerialName("item_image") val itemImage: String,
    @SerialName("item_pric