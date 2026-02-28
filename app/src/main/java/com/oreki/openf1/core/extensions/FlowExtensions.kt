package com.oreki.openf1.core.extensions

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

fun <T> Flow<T>.asResult(): Flow<Result<T>> {
    return this
        .catch { emit(Result.failure(it)) }
        .let { flow { emit(Result.success(it as T)) } }
}