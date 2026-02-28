package com.oreki.openf1.core.network

object ErrorMapper {
    fun mapError(throwable: Throwable): String {
        return throwable.message ?: "An unknown error occurred"
    }
}