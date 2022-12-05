package com.example.hexagonal_architecture.adapter.jpa.user

import com.example.hexagonal_architecture.domain.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository : JpaRepository<User, Long>