package com.example.hexagonal_architecture.domain

import java.time.LocalDate

data class User(
    val id: Long,
    val name: String,
    val birthDay: LocalDate,
    val email: String
)
