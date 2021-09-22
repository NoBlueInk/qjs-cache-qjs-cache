
package com.example.data.repositories.productRepository

import com.example.data.dto.product.*
import com.example.db.*
import com.example.domin.mapper.*
import org.ktorm.entity.map

class ProductRepositoryImpl : ProductRepository {


    override suspend fun getAllProductsFromStocks(): List<StockDto> {
//        return dataBase.stock.map { it.toStockDto() }
          TODO("Not yet implemented")
    }

    override suspend fun getAllProducts(): List<ProductDto> {
//        return dataBase.product.map { it.toProductDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllColors(): List<ColorDto> {
//        return dataBase.color.map { it.toColorDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllCategory(): List<CategoryDto> {
//        return dataBase.category.map { it.toCategoryDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllSupplier(): List<SupplierDto> {
//        return dataBase.supplier.map { it.toSupplerDto() }
        TODO("Not yet implemented")
    }
