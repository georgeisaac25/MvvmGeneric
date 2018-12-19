package com.example.georgeissac.mvvmgeneric.demo.mvvm

import android.arch.lifecycle.ViewModel
import kotlinx.coroutines.Job

abstract class BaseViewModel(protected val commonJob: Job) : ViewModel(), MvvmViewModel {

}