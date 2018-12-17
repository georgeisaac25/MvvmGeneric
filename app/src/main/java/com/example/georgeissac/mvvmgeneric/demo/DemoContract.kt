package com.example.georgeissac.mvvmgeneric.demo

import com.example.georgeissac.mvvmgeneric.demo.mvvm.MvvmView
import com.example.georgeissac.mvvmgeneric.demo.mvvm.MvvmViewModel

interface DemoContract {

    interface View : MvvmView<ViewModel> {
        fun showProgress()
        fun hideProgress()
    }

    interface ViewModel : MvvmViewModel {
        fun getResult()
    }

}