package com.oreki.openf1.data.datasource

import com.oreki.openf1.data.remote.api.F1ApiService
import com.oreki.openf1.data.remote.dto.VenueDto
import com.oreki.openf1.domain.model.Venue

class VenuesRemoteDataSource (
    private val api: F1ApiService
) {
    suspend fun getVenues(
        year: Int ?= null,
        countryName: String ?= null
    ): List<VenueDto> {
        return api.getMeetings(year, countryName)
    }
}