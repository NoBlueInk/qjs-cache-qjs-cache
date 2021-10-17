package com.example.data.repositories.stockRepository

import com.example.data.dto.stockApp.SectionsDto

interface StockAppRepository {
    suspend fun getSectionsStockApp(): List<SectionsDto>
}