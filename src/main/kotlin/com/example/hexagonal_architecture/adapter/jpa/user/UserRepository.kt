package com.example.hexagonal_architecture.adapter.jpa.user

import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<UserEntity, Long>