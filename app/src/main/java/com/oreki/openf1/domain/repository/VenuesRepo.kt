package com.oreki.openf1.domain.repository
import com.oreki.openf1.domain.model.Venue

interface VenuesRepo {
    suspend fun getVenues(): List<Venue>
}