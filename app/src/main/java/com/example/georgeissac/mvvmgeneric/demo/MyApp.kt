package com.example.georgeissac.mvvmgeneric.demo

import android.app.Application

import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.ApiServiceModule
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.ApplicationComponent
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.DaggerApplicationComponent
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.DataRepositoryModule
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.DatabaseModule
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.ViewModelModule

import dagger.android.support.DaggerAppCompatActivity


class MyApp : Application() {

    lateinit var appComponent: ApplicationComponent
        internal set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerApplicationComponent.builder().apiServiceModule(ApiServiceModule())
            .databaseModule(DatabaseModule(this))
            .dataRepositoryModule(DataRepositoryModule())
            //.viewModelModule(ViewModelModule())
            .build()
    }
}
