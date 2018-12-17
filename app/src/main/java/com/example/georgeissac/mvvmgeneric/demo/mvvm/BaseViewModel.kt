package com.example.georgeissac.mvvmgeneric.demo.mvvm

import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.Job

abstract class BaseViewModel(val commonJob: Job) : ViewModel(), MvvmViewModel {

    //var compositeJob = Job()
    abstract fun getResult()

    fun getJob() : Job {
        return commonJob
    }
}