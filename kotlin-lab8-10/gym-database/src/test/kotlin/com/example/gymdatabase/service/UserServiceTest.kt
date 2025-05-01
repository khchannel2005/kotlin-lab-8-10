package com.example.gymdatabase.service

import com.example.gymdatabase.model.User
import com.example.gymdatabase.repository.UserRepository
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UserServiceTest {

    private val userRepository = mockk<UserRepository>()
    private val userService = UserService(userRepository)

    @Test
    fun `test getAllUsers returns list`() {
        val users = listOf(User(name = "Test User", email = "test@test.com"))
        every { userRepository.findAll() } returns users

        val result = userService.getAllUsers()
        assertEquals(1, result.size)
        assertEquals("Test User", result[0].name)
    }
}
