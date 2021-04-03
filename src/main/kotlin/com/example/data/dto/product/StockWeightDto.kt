package com.example.data.dto.product

import com.example.data.entities.productsEntites.StockEntity
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class StockWeightDto(
    @SerialName("stock_weight_id") val stockWeightId: Int,
