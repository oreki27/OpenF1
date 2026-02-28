package com.oreki.openf1.domain.repository

import com.oreki.openf1.domain.model.User
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    fun getUser(userId: String): Flow<User>
    suspend fun updateUser(user: User): Result<Unit>
}