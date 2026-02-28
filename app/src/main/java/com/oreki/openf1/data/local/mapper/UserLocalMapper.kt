package com.oreki.openf1.data.local.mapper

import com.oreki.openf1.data.local.entity.UserEntity
import com.oreki.openf1.domain.model.User

fun UserEntity.toDomain(): User {
    return User(
        id = id,
        name = name,
        email = email
    )
}

fun User.toEntity(): UserEntity {
    return UserEntity(
        id = id,
        name = name,
        email = email
    )
}