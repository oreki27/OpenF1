package com.oreki.openf1.data.repository

import com.oreki.openf1.core.network.NetworkResult
import com.oreki.openf1.data.datasource.UserLocalDataSource
import com.oreki.openf1.data.datasource.UserRemoteDataSource
import com.oreki.openf1.data.local.mapper.toDomain
import com.oreki.openf1.data.local.mapper.toEntity
import com.oreki.openf1.data.remote.mapper.toDomain
import com.oreki.openf1.domain.model.User
import com.oreki.openf1.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl(
    private val remoteDataSource: UserRemoteDataSource,
    private val localDataSource: UserLocalDataSource
) : UserRepository {

    override fun getUser(userId: String): Flow<User> = flow {
        // Try local first
        localDataSource.getUser(userId)?.let { entity ->
            emit(entity.toDomain())
        }

        // Fetch remote
        when (val result = remoteDataSource.getUser(userId)) {
            is NetworkResult.Success -> {
                val user = result.data.toDomain()
                localDataSource.saveUser(user.toEntity())
                emit(user)
            }
            is NetworkResult.Error -> {
                // Log error or emit cached data
            }
            else -> {}
        }
    }

    override suspend fun updateUser(user: User): kotlin.Result<Unit> {
        return try {
            localDataSource.updateUser(user.toEntity())
            kotlin.Result.success(Unit)
        } catch (e: Exception) {
            kotlin.Result.failure(e)
        }
    }
}