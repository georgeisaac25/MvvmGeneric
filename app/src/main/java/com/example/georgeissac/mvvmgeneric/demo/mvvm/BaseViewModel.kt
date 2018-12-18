package com.example.georgeissac.mvvmgeneric.demo.mvvm

import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.Job

abstract class BaseViewModel(private val commonJob: Job) : ViewModel(), MvvmViewModel {
    fun getJob() : Job {
        return commonJob
    }
}