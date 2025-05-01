package com.example.gymdatabase.repository

import com.example.gymdatabase.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
    fun findByEmail(email: String): User?
    fun findByNameContainingIgnoreCase(name: String): List<User>
}
