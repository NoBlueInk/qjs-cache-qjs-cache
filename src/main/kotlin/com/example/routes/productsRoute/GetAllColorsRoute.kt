
package com.example.routes.productsRoute

import com.example.data.repositories.productRepository.ProductRepository
import com.example.data.repositories.productRepository.ProductRepositoryImpl
import com.example.domin.endPoints.ProductsEndPoint
import com.example.utils.notFoundResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllColorRoute() {

    val productRepository by lazy { ProductRepositoryImpl() }

    post(ProductsEndPoint.AllColorsEndPoint.path) {
        val colors = productRepository.getAllColors()
        if (colors.isEmpty())
            call.notFoundResponse()
        else call.respond(colors)
    }
}