package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductConditionDto(
    @SerialName("condition_id") val conditionId: Int,
    @SerialName("condition_name") val conditionName: String,
    @SerialName("condition_created") val conditionCreated: String
)
