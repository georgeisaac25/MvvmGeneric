package com.example.georgeissac.mvvmgeneric.demo.dependencyinjection

import android.arch.lifecycle.ViewModelProvider
import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository
import com.example.georgeissac.mvvmgeneric.demo.mvvm.CustomViewModelFactory
import dagger.Module
import dagger.Provides

@Module(includes = arrayOf(DataRepositoryModule::class))
class ViewModelModule {

    @Provides
    fun provideViewModelFactory(repository: RepositoryContract): ViewModelProvider.Factory {
        return CustomViewModelFactory(repository)
    }

}