package com.oreki.openf1.domain.usecase

import com.oreki.openf1.domain.model.User
import com.oreki.openf1.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

class GetUserUseCase(
    private val userRepository: UserRepository
) {
    operator fun invoke(userId: String): Flow<User> {
        return userRepository.getUser(userId)
    }
}