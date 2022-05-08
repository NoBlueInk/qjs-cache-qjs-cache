
package com.example.domin.endPoints

sealed class ProductsEndPoint(val path: String) {
    object AllProductFromStockEndPoint : ProductsEndPoint(path = "stock/all")
    object AllProductEndPoint : ProductsEndPoint(path = "products")
    object AllCategoriesEndPoint : ProductsEndPoint(path = "categories")
    object AllBrandsEndPoint : ProductsEndPoint(path = "brands")
    object AllColorsEndPoint : ProductsEndPoint(path = "colors")
    object AllSupplierEndPoint : ProductsEndPoint(path = "suppliers")
    object AllTransfersEndPoint : ProductsEndPoint(path = "products/transfers")
    object AllWarehousesEndPoint : ProductsEndPoint(path = "warehouses")
    object AllProductUnitEndPoint : ProductsEndPoint(path = "units")
    object AllTransfersTypeEndPoint : ProductsEndPoint(path = "transfers/type")
    object AllProductTransfersMovementEndPoint : ProductsEndPoint(path = "transfers/movement")
    object AllProductConditionEndPoint : ProductsEndPoint(path = "product/condition")
}