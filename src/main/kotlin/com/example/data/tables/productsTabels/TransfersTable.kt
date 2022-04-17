package com.example.data.tables.productsTabels

import com.example.data.entities.productsEntites.TransfersEntity
import org.ktorm.schema.*

object TransfersTable : Table<TransfersEntity>("transfers"){
    val transferId = int("transfer_id").bindTo { it.transferId }.primaryKey()
    val stockCondi