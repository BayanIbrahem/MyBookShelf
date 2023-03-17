package com.dev.bayan_ibrahim.shelf.domain.model

data class BooksResponse(
    val books: List<Book>,
    val kind: String,
    val totalBooks: Int
)