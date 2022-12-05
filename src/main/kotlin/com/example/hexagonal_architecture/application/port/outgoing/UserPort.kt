package com.example.hexagonal_architecture.application.port.outgoing

import com.example.hexagonal_architecture.domain.User

interface UserPort {
    fun getUser(): User
}