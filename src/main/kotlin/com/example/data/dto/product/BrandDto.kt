
package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BrandDto(
    @SerialName("brand_id") val brandId: Int,
    @SerialName("brand_name") val brandName: String,
    @SerialName("brand_create_at") val brandCreateAt: String
)