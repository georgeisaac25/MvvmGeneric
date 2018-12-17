package com.example.georgeissac.mvvmgeneric.demo.dependencyinjection;




import com.example.georgeissac.mvvmgeneric.demo.DemoActivity;
import com.example.georgeissac.mvvmgeneric.demo.data.DataRepository;

import dagger.Component;

@Component(modules = {ApiServiceModule.class, DatabaseModule.class, DataRepositoryModule.class, ViewModelModule.class})
public interface ApplicationComponent {
    ApplicationComponent getApplicationComponent();
    void inject(DemoActivity demoActivity);
}
