package com.example.georgeissac.mvvmgeneric.demo

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.PersistableBundle
import com.example.data.database.AppDatabase
import com.example.georgeissac.mvvmgeneric.R
import com.example.georgeissac.mvvmgeneric.demo.dependencyinjection.RepositoryContract
import com.example.georgeissac.mvvmgeneric.demo.mvvm.BaseView
import com.example.georgeissac.mvvmgeneric.demo.retrofit.ApiInterface
import javax.inject.Inject

class DemoActivity : BaseView<DemoContract.ViewModel>(),DemoContract.View{
    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    @Inject
    lateinit var datsbase:AppDatabase

    @Inject
    lateinit var apiInterface: ApiInterface

    @Inject
    lateinit var dataRepository: RepositoryContract

    /*@Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory*/

    lateinit var demoViewModel: DemoViewModel

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_main)
        /*val vm = retrieveAssociatedViewModelInstance()
        vm.getResult()
        vm.destroy()*/
    }

    override fun inject() {
        if (application is MyApp)
            (application as MyApp).appComponent.inject(this)
    }

    override fun getViewModelInstance(): DemoContract.ViewModel {
        //TODO Inject from actvity scope
        //for now using null value
        return demoViewModel
    }
}