package com.example.domin.mapper

import com.example.data.dto.product.TransfersDto
import com.example.data.entities.productsEntites.TransfersEntity

fun TransfersEntity.toTransfersDto() = TransfersDto(
    transferId = transferId,
    stockConditionId = stockConditionId.toProductConditionDto(),
    transferTypeId = transferTypeId.toTransfersTypeDto(),
    quantity = quantity,
    transferMovementCreated =