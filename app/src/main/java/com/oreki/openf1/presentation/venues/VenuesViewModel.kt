package com.oreki.openf1.presentation.venues

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.oreki.openf1.domain.model.Venue
import com.oreki.openf1.domain.repository.VenuesRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class VenuesViewModel @Inject constructor(
    private val repository: VenuesRepo
) : ViewModel() {

    private val _venues = MutableStateFlow<List<Venue>>(emptyList())
    val venues: StateFlow<List<Venue>> = _venues.asStateFlow()

    fun getVenues() {
        viewModelScope.launch {
            _venues.value = repository.getVenues()
        }
    }
}
