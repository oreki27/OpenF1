package com.oreki.openf1.data.remote.mapper

import com.oreki.openf1.data.remote.dto.UserDto
import com.oreki.openf1.domain.model.User

fun UserDto.toDomain(): User {
    return User(
        id = id,
        name = name,
        email = email
    )
}