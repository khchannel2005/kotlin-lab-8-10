package com.example.gymdatabase.model

import jakarta.persistence.*

@Entity
data class WorkoutSession(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val date: String,

    val duration: Int, // хвилини

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User
)
