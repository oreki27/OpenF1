package com.oreki.openf1.data.remote.api

import com.oreki.openf1.data.remote.dto.UserDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface UserApi {
    @GET("users/{id}")
    suspend fun getUser(@Path("id") userId: String): Response<UserDto>
}