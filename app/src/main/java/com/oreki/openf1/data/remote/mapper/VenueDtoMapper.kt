package com.oreki.openf1.data.remote.mapper

import com.oreki.openf1.data.remote.dto.VenueDto
import com.oreki.openf1.domain.model.Venue

fun VenueDto.toDomain(): Venue {
    return Venue(
        meetingKey = meeting_key,
        meetingName = meeting_name,
        meetingOfficialName = meeting_official_name,
        location = location,
        countryKey = country_key,
        countryCode = country_code,
        countryName = country_name,
        countryFlag = country_flag,
        circuitKey = circuit_key,
        circuitShortName = circuit_short_name,
        circuitType = circuit_type,
        circuitInfoUrl = circuit_info_url,
        circuitImage = circuit_image,
        gmtOffset = gmt_offset,
        dateStart = date_start,
        dateEnd = date_end,
        year = year
    )
}