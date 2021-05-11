
package com.example.data.entities.authEntites

import org.ktorm.entity.Entity

interface RoleEntity : Entity<RoleEntity> {
    companion object : Entity.Factory<RoleEntity>()

    var rolesId: Int
    var rolesName: String
    var rolesDescription: String
}