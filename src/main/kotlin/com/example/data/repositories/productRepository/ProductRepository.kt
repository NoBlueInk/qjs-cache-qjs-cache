package com.example.data.repositories.productRepository

import com.example.data.dto.product.*
import com.example.data.entities.productsEntites.ProductTransfersMovementEntity

interface ProductRepository {

    suspend fun getAllProductsFromStocks(): List<StockDto>

    suspen