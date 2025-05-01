package com.example.gymdatabase.repository

import com.example.gymdatabase.model.WorkoutSession
import org.springframework.data.jpa.repository.JpaRepository

interface WorkoutSessionRepository : JpaRepository<WorkoutSession, Long>
