package com.example.georgeissac.mvvmgeneric.demo.dependencyinjection

import android.arch.persistence.room.Room
import android.content.Context
import com.example.data.database.AppDatabase
import com.example.data.database.CountryDao
import dagger.Module
import dagger.Provides

@Module
class DatabaseModule(context: Context){
    private val DB_NAME = "countryDatabase.db"//must be changed later
    var database: AppDatabase
    init {
        this.database = Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            DB_NAME
        ).build()
    }

    @Provides
    fun provideDb(): AppDatabase {
        return database
    }

    @Provides
    fun provideDao(database: AppDatabase): CountryDao {
        return database.countryDao()
    }
}