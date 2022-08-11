package com.example.plugins.routing

import com.example.routes.stockAppRoute.getSectionsRoute
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.stockAppConfigurationRouting() {
    routing {
        getSectionsRoute()
    }
}