package com.example.georgeissac.mvvmgeneric.demo.dependencyinjection


import com.example.georgeissac.mvvmgeneric.demo.retrofit.ApiInterface

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class ApiServiceModule {

    companion object {
        val BASE_URL = "https://restcountries.eu/"
    }

    val retrofit: Retrofit
        @Provides
        get() = Retrofit.Builder()
            .baseUrl(BASE_URL)
            //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    fun getApiService(retrofit: Retrofit): ApiInterface {
        return retrofit.create<ApiInterface>(ApiInterface::class.java!!)
    }



}
