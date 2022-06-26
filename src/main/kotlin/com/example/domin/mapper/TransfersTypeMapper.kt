
package com.example.domin.mapper

import com.example.data.dto.product.TransfersTypeDto
import com.example.data.entities.productsEntites.TransfersTypeEntity

fun TransfersTypeEntity.toTransfersTypeDto() =
    TransfersTypeDto(
        transferTypeId = transferTypeId,
        transfersName = transfersName,
        transfersCreated = "$transfersCreated"
    )