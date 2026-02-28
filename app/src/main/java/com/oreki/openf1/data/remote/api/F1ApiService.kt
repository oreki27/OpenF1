package com.oreki.openf1.data.remote.api

import com.oreki.openf1.data.remote.dto.VenueDto
import retrofit2.http.GET
import retrofit2.http.Query

const val BASE_URL = "https://api.openf1.org/"

const val DRIVERS = "${BASE_URL}v1/drivers"
const val MEETINGS = "${BASE_URL}v1/meetings"

interface F1ApiService {

    @GET(value = DRIVERS)
    suspend fun getDrivers(driverNumber: String)

    @GET(value = MEETINGS)
    suspend fun getMeetings(
        @Query("year") year: Int? = null,
        @Query("country_name") countryName: String? = null
    ): List<VenueDto>
}
