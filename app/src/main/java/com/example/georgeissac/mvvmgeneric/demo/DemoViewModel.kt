package com.example.georgeissac.mvvmgeneric.demo

import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.RepositoryContract
import com.example.georgeissac.mvvmgeneric.demo.mvvm.BaseViewModel
import kotlinx.coroutines.Job

class DemoViewModel(repository: RepositoryContract,job: Job)
    : BaseViewModel(job),DemoContract.ViewModel {

    override fun getResult() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun destroy() {
        getJob().cancel()
    }
}