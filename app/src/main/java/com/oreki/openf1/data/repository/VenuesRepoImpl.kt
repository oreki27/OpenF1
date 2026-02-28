package com.oreki.openf1.data.repository

import com.oreki.openf1.data.datasource.VenuesRemoteDataSource
import com.oreki.openf1.data.remote.mapper.toDomain
import com.oreki.openf1.domain.model.Venue
import com.oreki.openf1.domain.repository.VenuesRepo

class VenuesRepoImpl(
    private val remoteDataSource: VenuesRemoteDataSource
): VenuesRepo {
    override suspend fun getVenues(): List<Venue> {
        return remoteDataSource
            .getVenues()
            .map {
                it.toDomain()
            }
    }
}