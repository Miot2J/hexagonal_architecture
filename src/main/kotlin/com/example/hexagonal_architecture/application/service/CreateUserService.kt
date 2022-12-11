package com.example.hexagonal_architecture.application.service

import com.example.hexagonal_architecture.application.port.incoming.CreateUserUseCase
import com.example.hexagonal_architecture.application.port.outgoing.UserPort
import com.example.hexagonal_architecture.domain.User
import org.springframework.stereotype.Service

@Service
class CreateUserService(
    private val createUserJpaAdapter: UserPort,
//    private val createUserMybatisAdapter: UserPort
) : CreateUserUseCase {
    override fun createUser(user: User): User = createUserJpaAdapter.createUser(user)

    // mybatis를 통해 저장해야 한다면 구현체인 adapter를 변경하면 됩니다.
//    override fun createUser(user: User): User = createUserMybatisAdapter.createUser(user)
}