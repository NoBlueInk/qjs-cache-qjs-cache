package com.example.data.dto.product

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SupplierDto(
    @SerialName("supplier_id")val supplierId: Int,
    @SerialName("supplier_name")val supplierName: String,
