package com.example.hexagonal_architecture.application.service

import com.example.hexagonal_architecture.application.port.incoming.CreateUserUseCase
import com.example.hexagonal_architecture.application.port.incoming.DeleteUserUseCase
import com.example.hexagonal_architecture.application.port.incoming.ReadUserUseCase
import com.example.hexagonal_architecture.application.port.incoming.UpdateUserUseCase
import com.example.hexagonal_architecture.application.port.incoming.UserUseCase
import com.example.hexagonal_architecture.application.port.outgoing.UserPort
import com.example.hexagonal_architecture.domain.User
import org.springframework.stereotype.Service

@Service
class UserService(
    private val userJpaAdapter: UserPort,
) : CreateUserUseCase, ReadUserUseCase, UpdateUserUseCase, DeleteUserUseCase {
    override fun createUser(user: User): User {
        return userJpaAdapter.createUser(user)
    }

    override fun deleteUser(id: Long): User {
        TODO("Not yet implemented")
    }

    override fun readUser(id: Long): User {
        TODO("Not yet implemented")
    }

    override fun updateUser(id: Long): User {
        TODO("Not yet implemented")
    }
}

// 아래와 같은 half hexagonal 도입시, UseCase 보일러 플레이트 코드를 줄일 수 있음
class HalfHexagonalUserService(
    private val userJpaAdapter: UserPort
) : UserUseCase {
    override fun createUser(user: User): User {
        return userJpaAdapter.createUser(user)
    }

    override fun readUser(id: Long): User {
        TODO("Not yet implemented")
    }

    override fun updateUser(id: Long): User {
        TODO("Not yet implemented")
    }

    override fun deleteUser(id: Long): User {
        TODO("Not yet implemented")
    }
}