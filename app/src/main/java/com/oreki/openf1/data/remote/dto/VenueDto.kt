package com.oreki.openf1.data.remote.dto

import androidx.room.Entity

@Entity
data class VenueDto(
    val meeting_key: Int,
    val meeting_name: String,
    val meeting_official_name: String,
    val location: String,
    val country_key: Int,
    val country_code: String,
    val country_name: String,
    val country_flag: String,
    val circuit_key: Int,
    val circuit_short_name: String,
    val circuit_type: String,
    val circuit_info_url: String,
    val circuit_image: String,
    val gmt_offset: String,
    val date_start: String,
    val date_end: String,
    val year: Int
)