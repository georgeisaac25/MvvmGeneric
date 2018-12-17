package com.example.georgeissac.mvvmgeneric.demo.mvvm

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider

import com.example.georgeissac.mvvmgeneric.demo.DemoViewModel
import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.RepositoryContract
import javax.inject.Inject

class CustomViewModelFactory @Inject
constructor(private val repository: RepositoryContract) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return DemoViewModel(repository) as T
    }
}
