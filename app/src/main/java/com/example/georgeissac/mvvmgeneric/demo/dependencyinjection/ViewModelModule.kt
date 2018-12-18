package com.example.georgeissac.mvvmgeneric.demo.dependencyinjection

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import com.example.georgeissac.mvvmgeneric.demo.DemoContract
import com.example.georgeissac.mvvmgeneric.demo.DemoViewModel
import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository
import com.example.georgeissac.mvvmgeneric.demo.mvvm.CustomViewModelFactory
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.Job

@Module(includes = arrayOf(DataRepositoryModule::class))
class ViewModelModule (val activity: AppCompatActivity,val viewModel: DemoViewModel) {

    @Provides
    fun provideViewModelFactory(repository: RepositoryContract,job: Job): ViewModelProvider.Factory {
        return CustomViewModelFactory(repository,job)
    }

    @Provides
    fun provideJob() : Job{
        return Job()
    }

    @Provides
    fun provideContractInterface(factory : ViewModelProvider.Factory) : DemoContract.ViewModel{
        return  ViewModelProviders.of(activity, factory)
            .get(viewModel::class.java!!)
    }

}