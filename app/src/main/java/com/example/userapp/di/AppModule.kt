package com.example.userapp.di

import com.example.userapp.data.repository.UserRepositoryImpl
import com.example.userapp.domain.repository.UserRepository
import com.example.userapp.domain.usecase.GetUserByIdUseCase
import com.example.userapp.domain.usecase.GetUsersUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideUserRepository(): UserRepository = UserRepositoryImpl()

    @Provides
    fun provideGetUsersUseCase(repo: UserRepository) = GetUsersUseCase(repo)

    @Provides
    fun provideGetUserByIdUseCase(repo: UserRepository) = GetUserByIdUseCase(repo)
}
