package com.example.routes.productsRoute

import com.example.data.repositories.productRepository.ProductRepositoryImpl
import com.example.domin.endPoints.ProductsEndPoint
import com.example.utils.notFoundResponse
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.getAllBrandsRoute() {

    val productRepository by lazy { ProductRepositoryImpl() }

    post(ProductsEndPoint.AllBrandsEndPoint.path) {
        val brands = productRe