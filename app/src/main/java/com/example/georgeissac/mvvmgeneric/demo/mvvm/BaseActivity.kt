package com.example.georgeissac.mvvmgeneric.demo.mvvm

import android.support.v7.app.AppCompatActivity

abstract class BaseActivity<P : MvvmViewModel> : AppCompatActivity(), MvvmView<P> {

    fun showProgress(){

    }

    fun hideProgress(){

    }

    abstract fun getDependencies()

}