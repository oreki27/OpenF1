package com.oreki.openf1.di

import com.oreki.openf1.data.datasource.UserLocalDataSource
import com.oreki.openf1.data.datasource.UserRemoteDataSource
import com.oreki.openf1.data.repository.UserRepositoryImpl
import com.oreki.openf1.domain.repository.UserRepository

object RepositoryModule {
    fun provideUserRepository(
        remoteDataSource: UserRemoteDataSource,
        localDataSource: UserLocalDataSource
    ): UserRepository {
        return UserRepositoryImpl(remoteDataSource, localDataSource)
    }
}