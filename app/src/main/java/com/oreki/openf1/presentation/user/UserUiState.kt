package com.oreki.openf1.presentation.user

import com.oreki.openf1.domain.model.User

data class UserUiState(
    val user: User? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)