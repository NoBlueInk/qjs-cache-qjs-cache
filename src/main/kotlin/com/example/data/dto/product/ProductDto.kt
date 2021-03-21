package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductDto(
    @SerialName("product_id") val productId: Long,
    @SerialName("item_name") val itemName: String,
    @SerialName("product_code") val productCode: String,
    @SerialName("item_image") val itemImage: String,
    @SerialName("item_price") val itemPrice: Float,
    @SerialName("item_createdAt") val itemCreateAt: String,
    @SerialName("brand_id") val brandId: BrandDto,
    @SerialName("supplier_id") val supplierId: SupplierDto,
    @SerialName("category_id") val categoryId: CategoryDto,
    @SerialName("unit_id") val unit