
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

    override suspend fun getAllBrands(): List<BrandDto> {
//        return dataBase.brands.map { it.toBrandDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllTransfers(): List<TransfersDto> {
//        return dataBase.transfers.map { it.toTransfersDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllWarehouses(): List<WarehousesDto> {
//        return dataBase.warehouses.map { it.toWarehousesDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllTransfersType(): List<TransfersTypeDto> {
//        return dataBase.transfersType.map { it.toTransfersTypeDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllProductTransfersMovement(): List<ProductTransfersMovementDto> {
//        return dataBase.productTransferMovements.map { it.toTransferMovementDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllStockWeight(): List<StockWeightDto> {
//        return dataBase.stockWeight.map { it.toStockWeightDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllProductUnits(): List<ProductUnitDto> {
//        return dataBase.productUnit.map { it.toProductUnitDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllStockColors(): List<StockColorDto> {
//        return dataBase.stockColor.map { it.toStockColorDto() }
        TODO("Not yet implemented")
    }

    override suspend fun getAllProductCondition(): List<ProductConditionDto> {
//        return dataBase.productCondition.map { it.toProductConditionDto() }
        TODO("Not yet implemented")
    }

    /*
    SELECT stock_id, stock.product_id, item_name,
    product.product_code, product_created, quantity_in_hand,
    item_image, item_price, brand_name, supplier_name,
    unit_name, warehouse_name
    FROM product, stock, product_unit, warehouses, brand, supplier
    where product.product_id = stock.product_id
    and product_unit.unit_id = product.unit_id
    and brand.brand_id = product.brand_id
    and supplier.supplier_id = product.supplier_id
    and warehouses.warehouse_id = stock.warehouse_id
    order by product.product_id
    */

    override suspend fun getCustom(): List<ProductDto> {
        TODO()
    }

}