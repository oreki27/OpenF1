package com.oreki.openf1.data.datasource

import com.oreki.openf1.core.network.NetworkResult
import com.oreki.openf1.data.remote.api.UserApi
import com.oreki.openf1.data.remote.dto.UserDto
import com.oreki.openf1.data.remote.mapper.toDomain
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UserRemoteDataSource(
    private val userApi: UserApi
) {
    suspend fun getUser(userId: String): NetworkResult<UserDto> {
        return withContext(Dispatchers.IO) {
            try {
                val response = userApi.getUser(userId)
                if (response.isSuccessful) {
                    response.body()?.let {
                        NetworkResult.Success(it)
                    } ?: NetworkResult.Error("Empty response")
                } else {
                    NetworkResult.Error("Error: ${response.code()}")
                }
            } catch (e: Exception) {
                NetworkResult.Error(e.message ?: "Unknown error")
            }
        }
    }
}