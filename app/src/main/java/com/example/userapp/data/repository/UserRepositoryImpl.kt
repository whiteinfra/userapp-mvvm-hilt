package com.example.userapp.data.repository

import com.example.userapp.domain.model.User
import com.example.userapp.domain.repository.UserRepository
import kotlinx.coroutines.delay

class UserRepositoryImpl : UserRepository {
    private val users = listOf(
        User(1, "Олена", "olena@example.com"),
        User(2, "Ігор", "ihor@example.com"),
        User(3, "Марія", "maria@example.com")
    )

    override suspend fun getUsers(): List<User> {
        delay(1000) // імітація завантаження
        return users
    }

    override suspend fun getUserById(id: Int): User? {
        delay(500)
        return users.find { it.id == id }
    }
}
