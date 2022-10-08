
package com.example.routes.productsRoute

import com.example.data.repositories.productRepository.ProductRepositoryImpl
import com.example.domin.endPoints.ProductsEndPoint
import com.example.utils.notFoundResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllTransfersTypeRoute() {
    val productRepository by lazy { ProductRepositoryImpl() }
    post(ProductsEndPoint.AllTransfersTypeEndPoint.path) {
        val transfersType = productRepository.getAllTransfersType()
        if (transfersType.isEmpty())
            call.notFoundResponse()
        else call.respond(transfersType)
    }
}