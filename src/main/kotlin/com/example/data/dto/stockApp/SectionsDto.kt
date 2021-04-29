package com.example.data.dto.stockApp

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SectionsDto(
    @SerialName("sections_id") val sectionsID: Int,
    @SerialName("section_name") val sectionName: String,
    @SerialName("section_color") val sectionColor: String,
    @SerialName("section_icons") val sectionIconsPath: String,
)