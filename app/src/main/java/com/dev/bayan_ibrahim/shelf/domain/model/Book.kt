package com.dev.bayan_ibrahim.shelf.domain.model

import kotlinx.serialization.SerialName

data class Book(
    val accessInfo: AccessInfo,
    val etag: String,
    val id: String,
    val kind: String,
    val saleInfo: SaleInfo,
    @SerialName("searchInfo")
    val textSnippet: String, /** this type changed form data class contains single string to string, the value of that string is the serial name annotation */
    val selfLink: String,
    val volumeInfo: VolumeInfo
)