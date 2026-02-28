package com.oreki.openf1.di

import com.oreki.openf1.data.datasource.VenuesRemoteDataSource
import com.oreki.openf1.data.remote.api.F1ApiService
import com.oreki.openf1.data.repository.VenuesRepoImpl
import com.oreki.openf1.domain.repository.VenuesRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideVenuesRemoteDataSource(api: F1ApiService): VenuesRemoteDataSource {
        return VenuesRemoteDataSource(api)
    }

    @Provides
    @Singleton
    fun provideVenuesRepo(remoteDataSource: VenuesRemoteDataSource): VenuesRepo {
        return VenuesRepoImpl(remoteDataSource)
    }
}
