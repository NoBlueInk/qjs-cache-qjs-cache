package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductUnitDto(
    @SerialName("unit_id") val unitId: Int,
    @SerialName("unit_name") val unitNam