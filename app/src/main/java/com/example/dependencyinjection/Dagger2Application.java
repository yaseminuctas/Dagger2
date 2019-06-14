package com.example.dependencyinjection;

import android.app.Application;

import com.example.dependencyinjection.injectors.AppComponent;
import com.example.dependencyinjection.injectors.AppModule;
import com.example.dependencyinjection.injectors.DaggerAppComponent;


public class Dagger2Application extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }



    public AppComponent getAppComponent() {
        return appComponent;
    }

}



