package com.example.mvvmdemodataapplication.model


import com.google.gson.annotations.SerializedName

data class CardList(
    @SerializedName("carts")
    var carts: List<Cart?>? = null,
    @SerializedName("limit")
    var limit: Int? = null,
    @SerializedName("skip")
    var skip: Int? = null,
    @SerializedName("total")
    var total: Int? = null
) {
    data class Cart(
        @SerializedName("discountedTotal")
        var discountedTotal: Int? = null,
        @SerializedName("id")
        var id: Int? = null,
        @SerializedName("products")
        var products: List<Product?>? = null,
        @SerializedName("total")
        var total: Int? = null,
        @SerializedName("totalProducts")
        var totalProducts: Int? = null,
        @SerializedName("totalQuantity")
        var totalQuantity: Int? = null,
        @SerializedName("userId")
        var userId: Int? = null
    ) {
        data class Product(
            @SerializedName("discountPercentage")
            var discountPercentage: Double? = null,
            @SerializedName("discountedPrice")
            var discountedPrice: Int? = null,
            @SerializedName("id")
            var id: String? = null,
            @SerializedName("price")
            var price:String? = null,
            @SerializedName("quantity")
            var quantity: Int? = null,
            @SerializedName("title")
            var title: String? = null,
            @SerializedName("total")
            var total: Int? = null
        )
    }
}