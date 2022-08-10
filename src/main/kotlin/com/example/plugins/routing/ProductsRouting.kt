package com.example.plugins.routing

import com.example.routes.productsRoute.*
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.productsConfigRouting() {
    routing {
        getAllBrandsRoute()
        getAllCategoryRoute()
        getAllColorRoute()
        getAllProductTransfersMovementRoute()
        getAllProductUnitRoute()
        getAllProductConditionRoute()
        getAllSupplierRoute()
        getAllTransfersRoute()
        getAllTransfersTypeRoute()
        getAllWarehousesRoute()
      