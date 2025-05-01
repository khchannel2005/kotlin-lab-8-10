package com.example.gymdatabase.model

import jakarta.persistence.*

@Entity
data class Subscription(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    val type: String,

    val startDate: String,

    @ManyToOne
    @JoinColumn(name = "user_id")
    val user: User
)
