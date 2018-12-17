package com.example.georgeissac.mvvmgeneric.demo.mvvm

//public interface MvpView<P extends MvpPresenter> {


interface MvvmView<P : MvvmViewModel> {
    fun retrieveAssociatedPresenterInstance(): P
}