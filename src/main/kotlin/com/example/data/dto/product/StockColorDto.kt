
package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StockColorDto(
    @SerialName("color_id") val colorId: Int,
    @SerialName("stock_id") val stockId: StockDto,
    @SerialName("quantity") val quantity: Float
)