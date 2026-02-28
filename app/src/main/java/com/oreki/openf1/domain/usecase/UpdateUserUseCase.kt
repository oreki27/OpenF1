package com.oreki.openf1.domain.usecase

import com.oreki.openf1.domain.model.User
import com.oreki.openf1.domain.repository.UserRepository

class UpdateUserUseCase(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(user: User): Result<Unit> {
        return userRepository.updateUser(user)
    }
}