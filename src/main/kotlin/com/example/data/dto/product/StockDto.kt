package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StockDto(
    @SerialName("stock_id") val stockId: Long,
    @SerialName("product_id") val productId: ProductDto,
    @SerialName("warehouse_id") val warehouseId: WarehousesDto,
    @SerialName("quantity_in_hand") val quantityInHand: Float,
    @SerialName("product_created") val productCreated: String,
)