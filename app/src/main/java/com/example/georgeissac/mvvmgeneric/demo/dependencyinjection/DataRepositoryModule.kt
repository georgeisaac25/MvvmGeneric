package com.example.georgeissac.mvvmgeneric.demo.dependencyinjection

import android.arch.lifecycle.ViewModelProvider
import com.example.data.database.CountryDao
import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository
import com.example.georgeissac.mvvmgeneric.demo.database.LocalDataSource
import com.example.georgeissac.mvvmgeneric.demo.mvvm.CustomViewModelFactory
import com.example.georgeissac.mvvmgeneric.demo.retrofit.ApiInterface
import com.example.georgeissac.mvvmgeneric.demo.retrofit.RemoteDataSource
import dagger.Module
import dagger.Provides

@Module(includes = arrayOf(ApiServiceModule::class,DatabaseModule::class))
class DataRepositoryModule{
    @Provides
    fun provideLocalDataResource(repoDao: CountryDao): LocalDataSource {
        return LocalDataSource(repoDao)
    }

    @Provides
    fun provideRemoteDataSource(apiInterface: ApiInterface): RemoteDataSource {
        return RemoteDataSource(apiInterface)
    }

    @Provides
    fun provideMyRepository(localDataSource: LocalDataSource, remoteDataSource: RemoteDataSource
    ): RepositoryContract {
        return DataRepository(localDataSource, remoteDataSource)
    }

    /*@Provides
    fun provideViewModelFactory(repository: RepositoryContract): ViewModelProvider.Factory {
        return CustomViewModelFactory(repository)
    }*/
}