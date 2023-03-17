package com.dev.bayan_ibrahim.shelf.domain.model

data class Offer(
    val finskyOfferType: Int,
    val listPrice: RelativePrice,
    val retailPrice: RelativePrice
)