package com.example.georgeissac.mvvmgeneric.demo

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.PersistableBundle
import com.example.data.database.AppDatabase
import com.example.georgeissac.mvvmgeneric.R
import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.RepositoryContract
import com.example.georgeissac.mvvmgeneric.demo.mvvm.BaseActivity
import com.example.georgeissac.mvvmgeneric.demo.retrofit.ApiInterface
import javax.inject.Inject

class DemoActivity : BaseActivity<DemoViewModel>(){

    @Inject
    lateinit var datsbase:AppDatabase

    @Inject
    lateinit var apiInterface: ApiInterface

    @Inject
    lateinit var dataRepository: RepositoryContract

    @Inject
    lateinit var viewModel: ViewModelProvider.Factory

    override fun retrieveAssociatedPresenterInstance(): DemoViewModel {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
    }

    override fun getDependencies() {
        if (application is MyApp)
            (application as MyApp).appComponent.inject(this)
    }
}