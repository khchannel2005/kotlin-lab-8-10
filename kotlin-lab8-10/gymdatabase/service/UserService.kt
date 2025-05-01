package com.example.gymdatabase.service

import com.example.gymdatabase.model.User
import com.example.gymdatabase.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun getAllUsers(): List<User> = userRepository.findAll()

    fun getUserById(id: Long): User? = userRepository.findById(id).orElse(null)

    fun createUser(user: User): User = userRepository.save(user)

    fun deleteUser(id: Long) = userRepository.deleteById(id)

    fun updateUser(id: Long, updatedUser: User): User? {
        return if (userRepository.existsById(id)) {
            userRepository.save(updatedUser.copy(id = id))
        } else {
            null
        }
    }

    fun findByNamePart(name: String): List<User> = userRepository.findByNameContainingIgnoreCase(name)
}
