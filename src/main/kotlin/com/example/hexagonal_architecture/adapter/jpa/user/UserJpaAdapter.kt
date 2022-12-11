package com.example.hexagonal_architecture.adapter.jpa.user

import com.example.hexagonal_architecture.application.port.outgoing.UserPort
import com.example.hexagonal_architecture.domain.User
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Component

@Component
class UserJpaAdapter(
    private val userRepository: UserRepository,
) : UserPort {
    override fun createUser(user: User): User {
        return userRepository.save(UserEntity(user)).toDomain()
    }

    override fun getUser(id: Long): User {
        val userEntity = userRepository.findByIdOrNull(id)

        return userEntity!!.toDomain()
    }
}
