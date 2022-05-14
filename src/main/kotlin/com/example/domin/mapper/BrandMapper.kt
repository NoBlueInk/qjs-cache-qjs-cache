package com.example.domin.mapper

import com.example.data.dto.product.BrandDto
import com.example.data.entities.productsEntites.BrandEntity

fun BrandEntity.toBrandDto() = BrandDto(
    brandId = brandId,
    brand