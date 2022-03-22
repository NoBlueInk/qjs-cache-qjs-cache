
package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.ProductConditionEntity
import org.ktorm.schema.*

object ProductConditionTable : Table<ProductConditionEntity>("stockproduct_condition") {
    val conditionId = int("condition_id").bindTo { it.conditionId }.primaryKey()
    val conditionName = varchar("condition_name").bindTo { it.conditionName }
    val conditionCreated = datetime("condition_created").bindTo { it.conditionCreated }
}