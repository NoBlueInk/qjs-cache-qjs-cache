package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.TransfersTypeEntity
import com.example.data.tables.productsTabels.WarehousesTable.bindTo
import org.ktorm.schema.*

object TransfersTypeTable: Table<TransfersTypeEntity>("transfer_types") {
    val transferTypeId = int("transfer_type_id").bindTo { it.transferTypeId }.primaryKey()
    val transfersName = varchar("transfer