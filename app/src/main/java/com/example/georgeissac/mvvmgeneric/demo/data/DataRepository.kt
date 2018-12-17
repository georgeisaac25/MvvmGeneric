package com.example.georgeissac.mvvmgeneric.demo.data

import com.example.georgeissac.mvvmgeneric.demo.database.LocalDataSource
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.RepositoryContract
import com.example.georgeissac.mvvmgeneric.demo.retrofit.RemoteDataSource


class DataRepository(val localDataSource: LocalDataSource, val remoteDataSource: RemoteDataSource) :
    RepositoryContract {



}