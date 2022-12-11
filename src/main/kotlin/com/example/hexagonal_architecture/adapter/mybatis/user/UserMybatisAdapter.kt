package com.example.hexagonal_architecture.adapter.mybatis.user

import com.example.hexagonal_architecture.application.port.outgoing.UserPort
import com.example.hexagonal_architecture.domain.User
import org.springframework.stereotype.Repository

@Repository
class UserMybatisAdapter(
    private val userMapper: UserMapper
) : UserPort {
    override fun createUser(user: User): User {
        val userData = userMapper.createUser(user)

        return userData.toDomain()
    }

    override fun getUser(): User {
        TODO("Not yet implemented")
    }
}
