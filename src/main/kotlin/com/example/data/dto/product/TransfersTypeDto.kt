package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TransfersTypeDto(
    @SerialName("transfer_type_id") val transferTypeId: Int,
    @SerialName("transfers_name") val transfersName: String,
    @SerialName("transfers_created") val transfersCreated: String
)
