package com.dev.bayan_ibrahim.shelf.domain.model

data class SaleInfo(
    val buyLink: String,
    val country: String,
    val isEbook: Boolean,
    val price: RelativePrice,
    val offers: List<Offer>,
    val retailPrice: RelativePrice,
    val saleability: String,
)