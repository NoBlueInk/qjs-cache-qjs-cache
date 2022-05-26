package com.example.domin.mapper

import com.example.data.dto.product.StockDto
import com.example.data.entities.productsEntites.StockEntity

fun StockEntity.toStockDto() = StockDto(
    stockId = stockId,
    productId = productId.toProductDto(),
    warehouseId = warehouseId.toWarehouses