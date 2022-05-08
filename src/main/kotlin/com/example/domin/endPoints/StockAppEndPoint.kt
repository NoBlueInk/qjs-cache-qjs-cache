
package com.example.domin.endPoints

sealed class StockAppEndPoint(val path:String) {
    object SectionsStockAppEndPoint:StockAppEndPoint(path = "stockApp/sections")