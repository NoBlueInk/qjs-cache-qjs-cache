package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ColorDto(
    @SerialName("color_id") val colorId: Int,
    @SerialName("color_name") val colorName: String,
    @SerialName("color_hex") val colorHex: String,
)