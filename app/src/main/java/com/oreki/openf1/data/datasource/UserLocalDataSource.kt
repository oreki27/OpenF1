package com.oreki.openf1.data.datasource

import com.oreki.openf1.data.local.dao.UserDao
import com.oreki.openf1.data.local.entity.UserEntity

class UserLocalDataSource(
    private val userDao: UserDao
) {
    suspend fun getUser(userId: String): UserEntity? {
        return userDao.getUser(userId)
    }

    suspend fun saveUser(user: UserEntity) {
        userDao.insertUser(user)
    }

    suspend fun updateUser(user: UserEntity) {
        userDao.updateUser(user)
    }
}