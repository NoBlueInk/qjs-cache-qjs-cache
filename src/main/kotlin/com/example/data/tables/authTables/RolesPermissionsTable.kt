package com.example.data.tables.authTables

import com.example.data.entities.authEntites.RolesPermissionsEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int

object RolesPermissionsTable : Table<RolesPermissionsEntity>("rolespermissions") {
    val role = int("role").references(RolesTable) { it.role }
    val permission = int("permission").references(PermissionsTable) { it.permission }
}