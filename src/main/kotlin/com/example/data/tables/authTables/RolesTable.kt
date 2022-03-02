package com.example.data.tables.authTables

import com.example.data.entities.authEntites.RoleEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object RolesTable : Table<RoleEntity>("roles") {
    val RolesId = int("roles_id").bindTo { it.rolesId }.primaryKey()
    val RolesName = varchar("roles_name").bindTo { it.rolesName }
    val RolesDescription = varchar("roles_description").bindTo { it.rolesDescription }
}