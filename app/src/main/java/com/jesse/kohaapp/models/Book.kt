package com.jesse.kohaapp.models

data class Book(
    val title: String,
    val author: String,
    val biblionumber: String,
    val available: Boolean
)