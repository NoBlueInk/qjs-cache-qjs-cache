package com.example.routes.productsRoute

import com.example.data.repositories.productRepository.ProductRepositoryImpl
import com.example.domin.endPoints.ProductsEndPoint
import com.example.utils.notFoundResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllWarehousesRoute() {

    val productRepository by lazy { ProductRepositoryImpl() }

    post(ProductsEndPoint.AllWarehousesEndPoint.path) {
        val warehouses = productRepository.getAllWarehouses()
        if (warehouses.isEmpty())
            call.notFoundResponse(