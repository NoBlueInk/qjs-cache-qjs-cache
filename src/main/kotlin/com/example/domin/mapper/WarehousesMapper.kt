
package com.example.domin.mapper

import com.example.data.dto.product.WarehousesDto
import com.example.data.entities.productsEntites.WarehousesEntity

fun WarehousesEntity.toWarehousesDto() =
    WarehousesDto(
        warehouseId = warehouseId,
        warehouseName = warehouseName,
        siteName = siteName
    )