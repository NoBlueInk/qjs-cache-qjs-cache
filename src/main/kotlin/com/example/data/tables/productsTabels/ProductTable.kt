package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.ProductEntity
import com.example.data.tables.productsTabels.ProductConditionTable.bindTo
import org.ktorm.schema.*

object ProductTable : Table<ProductEntity>("product") {
    val productId = long("product_id").bindTo { it.productId }.primaryKey()
    val itemName = varchar("item_name").bindTo { it.itemName }
    val productCode = varchar("product_code").bindTo { it.productCode }
    val itemImage = varchar("item_image").bindTo { it.itemImage }
    val itemPrice = float("item_price").bindTo { it.itemPrice }
    val itemCreateAt = datetime("item_createdAt").bindTo { it.itemCreateAt }
    val brandId = int("brand_id").references(BrandTable){it.brandId}
    val supplierId = int("supplier_id").references(SupplierTable) { it.supplierId }
    val categoryId = int("category_id").references(CategoryTable) { it.categoryId }
    val unitId = int("unit_id").references(ProductUnitTable) { it.unitId }
}