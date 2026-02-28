package com.oreki.openf1.di

import com.oreki.openf1.domain.repository.UserRepository
import com.oreki.openf1.domain.usecase.GetUserUseCase
import com.oreki.openf1.domain.usecase.UpdateUserUseCase

object UseCaseModule {
    fun provideGetUserUseCase(repository: UserRepository): GetUserUseCase {
        return GetUserUseCase(repository)
    }

    fun provideUpdateUserUseCase(repository: UserRepository): UpdateUserUseCase {
        return UpdateUserUseCase(repository)
    }
}