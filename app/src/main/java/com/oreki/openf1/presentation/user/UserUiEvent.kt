package com.oreki.openf1.presentation.user

sealed class UserUiEvent {
    data class LoadUser(val userId: String) : UserUiEvent()
    data class UpdateUser(val name: String, val email: String) : UserUiEvent()
    data object Refresh : UserUiEvent()
}