package com.dev.bayan_ibrahim.shelf.domain.model

data class AccessInfo(
    val accessViewStatus: String,
    val country: String,
    val embeddable: Boolean,
    val epub: BookFileTypeAccessInfo,
    val pdf: BookFileTypeAccessInfo,
    val publicDomain: Boolean,
    val quoteSharingAllowed: Boolean,
    val textToSpeechPermission: String,
    val viewability: String,
    val webReaderLink: String
)