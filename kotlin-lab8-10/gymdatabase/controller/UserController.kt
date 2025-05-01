package com.example.gymdatabase.controller

import com.example.gymdatabase.model.User
import com.example.gymdatabase.service.UserService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/users")
class UserController(private val userService: UserService) {

    @GetMapping
    fun getAllUsers() = userService.getAllUsers()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long) = userService.getUserById(id)

    @PostMapping
    fun createUser(@RequestBody user: User) = userService.createUser(user)

    @DeleteMapping("/{id}")
    fun deleteUser(@PathVariable id: Long) = userService.deleteUser(id)

    @PutMapping("/{id}")
    fun updateUser(@PathVariable id: Long, @RequestBody user: User) = userService.updateUser(id, user)

    @GetMapping("/search")
    fun searchUsers(@RequestParam name: String) = userService.findByNamePart(name)
}
