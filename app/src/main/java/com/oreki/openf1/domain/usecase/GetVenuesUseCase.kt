package com.oreki.openf1.domain.usecase

import com.oreki.openf1.domain.model.Venue
import com.oreki.openf1.domain.repository.VenuesRepo

class GetVenuesUseCase (
    private val repository: VenuesRepo
) {
    suspend operator fun invoke(): List<Venue> {
        return repository.getVenues()
    }
}
