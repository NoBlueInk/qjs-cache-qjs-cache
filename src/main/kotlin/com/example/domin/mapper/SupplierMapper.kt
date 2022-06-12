
package com.example.domin.mapper

import com.example.data.dto.product.SupplierDto
import com.example.data.entities.productsEntites.SupplierEntity

fun SupplierEntity.toSupplerDto()= SupplierDto(
    supplierId = supplierId,
    supplierName = supplierName,
    supplierCreateAt = "$supplierCreateAt"
)