package com.example.hexagonal_architecture.adapter.mybatis.user

import com.example.hexagonal_architecture.domain.User
import java.time.LocalDate

data class UserData(
    val id: Long,
    val name: String,
    val birthDay: LocalDate,
    val email: String
) {
    constructor(user: User) : this(
        id = user.id,
        name = user.name,
        birthDay = user.birthDay,
        email = user.email
    )

    fun toDomain(): User {
        return User(
            id = id,
            name = name,
            birthDay = birthDay,
            email = email
        )
    }
}
