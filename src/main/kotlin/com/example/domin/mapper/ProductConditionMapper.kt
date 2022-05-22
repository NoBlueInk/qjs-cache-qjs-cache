package com.example.domin.mapper

import com.example.data.dto.product.ProductConditionDto
import com.example.data.entities.productsEntites.ProductConditionEntity

fun ProductConditionEntity.toProductConditionDto() =
    ProductConditionDto(
        conditionId = conditionId,
        conditionName = conditionName,
        conditionCreated = "$conditionCreated"
    )