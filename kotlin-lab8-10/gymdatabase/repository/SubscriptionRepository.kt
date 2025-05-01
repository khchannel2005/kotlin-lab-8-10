package com.example.gymdatabase.repository

import com.example.gymdatabase.model.Subscription
import org.springframework.data.jpa.repository.JpaRepository

interface SubscriptionRepository : JpaRepository<Subscription, Long>
