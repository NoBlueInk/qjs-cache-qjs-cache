package com.example.data.dto.product

import com.example.data.entities.productsEntites.StockEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StockWeightDto(
    @SerialName("stock_weight_id") val stockWeightId: Int,
    @SerialName("stock_id") val stockId: StockDto,
    @SerialName("weight") val weight: String,
)
