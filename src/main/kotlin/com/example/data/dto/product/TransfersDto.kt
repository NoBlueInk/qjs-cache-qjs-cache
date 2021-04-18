package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TransfersDto(
    @SerialName("transfer_id") val transferId: Int,
    @SerialName("stock_condition_id") val stockConditionId: ProductConditionDto,
    @SerialName("transfer_type_id") val transferTypeId: TransfersTypeDto,
    @SerialName("quantity") val quantity: Float,
    @SerialName("transfer