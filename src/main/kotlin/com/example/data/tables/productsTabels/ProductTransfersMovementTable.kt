
package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.ProductTransfersMovementEntity
import com.example.data.tables.productsTabels.SupplierTable.primaryKey
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.long

object ProductTransfersMovementTable: Table<ProductTransfersMovementEntity>("product_transfer_movement") {
    val productId = long("product_id").references(ProductTable){it.productId}
    val transferId = int("transfer_id").references(TransfersTable){it.transfersId}
}