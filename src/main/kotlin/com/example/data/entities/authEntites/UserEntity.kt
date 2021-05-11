package com.example.data.entities.authEntites

import org.ktorm.entity.Entity
import java.time.LocalDateTime

interface UserEntity : Entity<UserEntity> {
    companion object : Entity.Factory<UserEntity>(