
package com.example.domin.mapper.stockappMapper

import com.example.data.dto.stockApp.SectionsDto
import com.example.data.entities.stockEntitites.SectionsEntity

fun SectionsEntity.toSectionDto() = SectionsDto(
    sectionsID = sectionsID,
    sectionName = sectionName,
    sectionColor = sectionColor,
    sectionIconsPath = sectionIconsPath
)