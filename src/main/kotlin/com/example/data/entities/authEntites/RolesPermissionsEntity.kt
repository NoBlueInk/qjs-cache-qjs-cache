package com.example.data.entities.authEntites

import org.ktorm.entity.Entity

interface RolesPermissionsEntity : Entity<RolesPermissionsEntity> {
    companion object : Entity.Factory<RolesPermissionsEntity>()

    val role: RoleEnt