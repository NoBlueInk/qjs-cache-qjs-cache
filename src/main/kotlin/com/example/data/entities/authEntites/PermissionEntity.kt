
package com.example.data.entities.authEntites

import org.ktorm.entity.Entity

interface PermissionEntity : Entity<PermissionEntity> {
    companion object : Entity.Factory<PermissionEntity>()

    val permissionId: Int
    val permissionName: String
    val permissionDescription: String
}