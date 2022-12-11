package com.example.hexagonal_architecture.application.port.incoming

import com.example.hexagonal_architecture.domain.User

// 하프헥사고날에서 사용할 UseCase 에시
interface UserUseCase {
    fun createUser(user: User): User

    fun readUser(id: Long): User

    fun updateUser(id: Long): User

    fun deleteUser(id: Long): User
}