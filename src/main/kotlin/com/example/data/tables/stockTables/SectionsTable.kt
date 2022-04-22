
package com.example.data.tables.stockTables

import com.example.data.entities.stockEntitites.SectionsEntity
import org.ktorm.schema.Table
import org.ktorm.schema.int
import org.ktorm.schema.varchar

object SectionsTable: Table<SectionsEntity>("app_sections") {
    val sectionId = int("section_id").bindTo { it.sectionsID }.primaryKey()
    val sectionName = varchar("section_name").bindTo { it.sectionName }
    val sectionColor = varchar("section_color").bindTo { it.sectionColor }
    val sectionIcon = varchar("section_icons").bindTo { it.sectionIconsPath }
}