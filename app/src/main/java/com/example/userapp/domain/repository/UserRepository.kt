package com.example.userapp.domain.repository

import com.example.userapp.domain.model.User

interface UserRepository {
    suspend fun getUsers(): List<User>
    suspend fun getUserById(id: Int): User?
}
