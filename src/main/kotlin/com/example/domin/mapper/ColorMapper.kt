package com.example.domin.mapper

import com.example.data.dto.product.ColorDto
import com.example.data.entities.productsEntites.ColorEntity

fun ColorEntity.toColorDto() = ColorDto(
    colorId = colorId,
    colorName = colorName,
    colorHe