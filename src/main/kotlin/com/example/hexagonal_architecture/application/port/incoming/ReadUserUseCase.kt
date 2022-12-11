package com.example.hexagonal_architecture.application.port.incoming

import com.example.hexagonal_architecture.domain.User

interface ReadUserUseCase {
    fun readUser(id: Long): User
}