
package com.example.routes.stockAppRoute

import com.example.data.repositories.stockRepository.StockAppRepositoryImpl
import com.example.domin.endPoints.StockAppEndPoint
import com.example.utils.notFoundResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getSectionsRoute() {

    val stockAppRepository by lazy { StockAppRepositoryImpl() }

    post(StockAppEndPoint.SectionsStockAppEndPoint.path) {
        val sections = stockAppRepository.getSectionsStockApp()
        if (sections.isEmpty())
            call.notFoundResponse()
        else call.respond(sections)
    }
}