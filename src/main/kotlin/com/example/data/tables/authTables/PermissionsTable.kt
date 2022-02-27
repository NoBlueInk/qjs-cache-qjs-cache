package com.example.data.tables.authTables

import com.example.data.entities.authEntites.PermissionEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object PermissionsTable : Table<PermissionEntity>("permissions") {
    val permissionId = int("permission_id").bindTo 