package com.example.userapp.domain.usecase

import com.example.userapp.domain.repository.UserRepository
import javax.inject.Inject

class GetUserByIdUseCase(
    private val repo: UserRepository
) {
    suspend operator fun invoke(id: Int) = repo.getUserById(id)
}
