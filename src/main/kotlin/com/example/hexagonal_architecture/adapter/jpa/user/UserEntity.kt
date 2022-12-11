package com.example.hexagonal_architecture.adapter.jpa.user

import com.example.hexagonal_architecture.domain.User
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class UserEntity(
    @Id
    val id: Long,
    var name: String,
    var birthDay: LocalDate,
    var email: String,
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