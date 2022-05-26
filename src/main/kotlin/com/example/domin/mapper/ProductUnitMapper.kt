
package com.example.domin.mapper

import com.example.data.dto.product.ProductUnitDto
import com.example.data.entities.productsEntites.ProductUnitEntity

fun ProductUnitEntity.toProductUnitDto() =
    ProductUnitDto(
        unitId = unitId,
        unitName = unitName,
        unitCreated = "$unitCreated"
    )