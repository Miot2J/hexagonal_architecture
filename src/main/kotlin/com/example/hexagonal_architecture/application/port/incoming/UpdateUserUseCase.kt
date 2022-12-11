package com.example.hexagonal_architecture.application.port.incoming

import com.example.hexagonal_architecture.domain.User


interface UpdateUserUseCase {
    fun updateUser(id: Long): User
}