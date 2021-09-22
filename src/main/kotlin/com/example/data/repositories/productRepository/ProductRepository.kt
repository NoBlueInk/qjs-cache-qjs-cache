package com.example.data.repositories.productRepository

import com.example.data.dto.product.*
import com.example.data.entities.productsEntites.ProductTransfersMovementEntity

interface ProductRepository {

    suspend fun getAllProductsFromStocks(): List<StockDto>

    suspend fun getAllProducts(): List<ProductDto>

    suspend fun getAllColors(): List<ColorDto>

    suspend fun getAllCategory(): List<CategoryDto>

    suspend fun getAllSupplier(): List<SupplierDto>

    suspend fun getAllBrands():List<BrandDto>

    suspend fun getAllTransfers(): List<TransfersDto>

    suspend fun getAllWarehouses(): List<WarehousesDto>

    suspend fun getAllTransfersType(): List<TransfersTypeDto>

    suspend fun getAllProductTransfersMovement():List<ProductTransfersMovementDto>

    suspend fun getAllStockWeight():List<StockWeightDto>

    suspend fun getAllProductUnits(): List<ProductUnitDto>

    suspend fun getAllStockColors():List<StockColorDto>

    suspend fun getAllProductCondition():List<ProductConditionDto>

