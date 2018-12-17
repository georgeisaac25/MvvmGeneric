package com.example.georgeissac.mvvmgeneric.demo.database


import com.example.data.database.CountryDao
import com.example.data.database.CountryEntity

import javax.inject.Inject

import io.reactivex.Maybe

class LocalDataSource @Inject
constructor(private val repoDao: CountryDao) {

    val allCountryUsingRx: Maybe<List<CountryEntity>>
        get() = repoDao.getAllUsingRx()

    fun all(): List<CountryEntity> {
        return repoDao.getAll()
    }

    fun searchByTextUsingRx(searchString: String): Maybe<List<CountryEntity>> {
        return repoDao.getSearchListUsingRx(searchString)
    }

    fun insertData(list: List<CountryEntity>): List<Long> {
        return repoDao.insert(list)
    }
}
