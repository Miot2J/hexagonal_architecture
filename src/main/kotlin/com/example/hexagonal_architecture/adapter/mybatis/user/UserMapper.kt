package com.example.hexagonal_architecture.adapter.mybatis.user

import com.example.hexagonal_architecture.domain.User
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UserMapper {
    fun createUser(user: User): UserData
}
