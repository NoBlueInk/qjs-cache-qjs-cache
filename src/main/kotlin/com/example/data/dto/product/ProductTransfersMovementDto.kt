
package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ProductTransfersMovementDto(
    @SerialName("product_id") val productMovementId: ProductDto,
    @SerialName("transferId") val transferMovementId: TransfersDto,
)