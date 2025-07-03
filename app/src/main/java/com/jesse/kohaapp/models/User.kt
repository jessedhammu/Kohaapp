package com.jesse.kohaapp.models

data class User(
    val firstname: String,
    val surname: String,
    val borrowings: List<BorrowedBook>,
    val fines: Double
)

data class BorrowedBook(
    val title: String,
    val issuedate: String,
    val duedate: String
)