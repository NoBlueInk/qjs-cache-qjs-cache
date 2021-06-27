package com.example.data.entities.stockEntitites

import org.ktorm.entity.Entity

interface SectionsEntity: Entity<SectionsEntity> {
    companion object: Entity.Factory<SectionsEntity>()
    val sectionsID: Int
    val sectionName: String
    val sectionColor: String
    val sectionIconsPath: String
}