package com.example.dependencyinjection.injectors;

import com.example.dependencyinjection.Dagger2Application;
import com.example.dependencyinjection.views.CarActivity;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton @Component(modules = AppModule.class)
public interface AppComponent {
    void inject(CarActivity carActivity);
}
