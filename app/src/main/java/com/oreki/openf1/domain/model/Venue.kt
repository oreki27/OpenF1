package com.oreki.openf1.domain.model

data class Venue(
    val meetingKey: Int,
    val meetingName: String,
    val meetingOfficialName: String,
    val location: String,
    val countryKey: Int,
    val countryCode: String,
    val countryName: String,
    val countryFlag: String,
    val circuitKey: Int,
    val circuitShortName: String,
    val circuitType: String,
    val circuitInfoUrl: String,
    val circuitImage: String,
    val gmtOffset: String,
    val dateStart: String,
    val dateEnd: String,
    val year: Int
)