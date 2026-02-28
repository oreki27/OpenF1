package com.oreki.openf1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.oreki.openf1.presentation.venues.VenuesScreen
import com.oreki.openf1.presentation.venues.VenuesViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val venuesViewModel: VenuesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        venuesViewModel.getVenues()

        setContent {
            VenuesScreen(viewModel = venuesViewModel)
        }
    }
}
