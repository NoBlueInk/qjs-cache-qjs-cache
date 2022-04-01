
package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.ProductUnitEntity
import org.ktorm.schema.*

object ProductUnitTable: Table<ProductUnitEntity>("product_unit") {
    val unitId = int("unit_id").bindTo { it.unitId }.primaryKey()
    val unitName = varchar("unit_name").bindTo { it.unitName }
    val unitCreated = datetime("unit_created").bindTo { it.unitCreated }
}