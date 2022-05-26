package com.example.domin.mapper

import com.example.data.dto.product.ProductTransfersMovementDto
import com.example.data.entities.productsEntites.ProductTransfersMovementEntity


fun ProductTransfersMovementEntity.toTransferMovementDto() =
    ProductTransfersMovementDto(
        productMovementId = productId.toProductDto(),
        transferMovementId = transfersId.toTransfersDto()
    )