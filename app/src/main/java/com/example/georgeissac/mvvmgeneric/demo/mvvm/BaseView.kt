package com.example.georgeissac.mvvmgeneric.demo.mvvm

import android.support.v7.app.AppCompatActivity

abstract class BaseView<P : MvvmViewModel> : AppCompatActivity(), MvvmView<P> {
    abstract fun inject()
}