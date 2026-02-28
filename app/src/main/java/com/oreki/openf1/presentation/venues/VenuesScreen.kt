package com.oreki.openf1.presentation.venues

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.lifecycle.compose.collectAsStateWithLifecycle

@Composable
fun VenuesScreen(
    viewModel: VenuesViewModel
) {
    val venues by viewModel.venues.collectAsStateWithLifecycle()

    // venues list is now available here - pass to your UI components
    // Example: venues.forEach { venue -> Text(venue.meetingName) }
}
