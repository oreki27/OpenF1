package com.oreki.openf1.di

import android.content.Context
import androidx.room.Room
import com.oreki.openf1.core.util.Constants
import com.oreki.openf1.data.local.dao.UserDao

object DatabaseModule {
    fun provideDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(
            context.applicationContext,
            AppDatabase::class.java,
            Constants.DATABASE_NAME
        ).build()
    }

    fun provideUserDao(database: AppDatabase): UserDao {
        return database.userDao()
    }
}

// Placeholder for actual database class
abstract class AppDatabase {
    abstract fun userDao(): UserDao
}