package com.example.domin.mapper

import com.example.data.dto.product.StockColorDto
import com.example.data.entities.productsEntites.StockColorEntity

fun StockColorEntity.toStockColorDto() =
    StockColorDto(
        colorId = colorId,
        stockId = stockId.toStockDto(),
        quantity = quantity
    )