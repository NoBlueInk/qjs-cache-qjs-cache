
package com.example.domin.mapper

import com.example.data.dto.product.ProductDto
import com.example.data.entities.productsEntites.ProductEntity

fun ProductEntity.toProductDto() = ProductDto(
    productId = productId,
    itemName = itemName,
    productCode = productCode,
    itemImage = itemImage,
    itemPrice = itemPrice,
    itemCreateAt = "$itemCreateAt",
    brandId = brandId.toBrandDto(),
    supplierId = supplierId.toSupplerDto(),
    categoryId = categoryId.toCategoryDto(),
    unitId = unitId.toProductUnitDto()
)