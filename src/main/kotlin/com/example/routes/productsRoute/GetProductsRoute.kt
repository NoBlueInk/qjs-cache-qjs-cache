package com.example.routes.productsRoute

import com.example.data.repositories.productRepository.ProductRepositoryImpl
import com.example.domin.endPoints.ProductsEndPoint
import com.example.utils.notFoundResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllProductsRoute() {

    val productRepository by lazy { ProductRepositoryImpl() }

    post(ProductsEndPoint.AllProductEndPoint.path) {
        val products = productRepository.getAllProducts()
        if (products.isEmpty())
            call.notFoundResponse()
        else call.respond(products)
    }
}