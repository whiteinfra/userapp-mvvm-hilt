package com.example.userapp.domain.usecase

import com.example.userapp.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersUseCase(
    private val repo: UserRepository
) {
    suspend operator fun invoke() = repo.getUsers()
}
