
package com.example.data.repositories.stockRepository

import com.example.data.dto.stockApp.SectionsDto
import com.example.db.sectionApp
import com.example.domin.mapper.stockappMapper.toSectionDto
import org.ktorm.entity.map

class StockAppRepositoryImpl : StockAppRepository {
    override suspend fun getSectionsStockApp(): List<SectionsDto> {
//        return dataBase.sectionApp.map { it.toSectionDto() }
        TODO("Not yet implemented")
    }
}