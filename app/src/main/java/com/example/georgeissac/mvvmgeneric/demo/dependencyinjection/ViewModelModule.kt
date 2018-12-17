package com.example.georgeissac.mvvmgeneric.demo.dependencyinjection

import android.arch.lifecycle.ViewModelProvider
import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository
import com.example.georgeissac.mvvmgeneric.demo.mvvm.CustomViewModelFactory
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Job

@Module(includes = arrayOf(DataRepositoryModule::class))
class ViewModelModule {

    @Provides
    fun provideViewModelFactory(repository: RepositoryContract,job: Job): ViewModelProvider.Factory {
        return CustomViewModelFactory(repository,job)
    }

    @Provides
    fun provideJob() : Job{
        return Job()
    }

}