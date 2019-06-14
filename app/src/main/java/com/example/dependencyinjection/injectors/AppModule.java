package com.example.dependencyinjection.injectors;

import com.example.dependencyinjection.Dagger2Application;
import com.example.dependencyinjection.model.Car;
import com.example.dependencyinjection.model.Engine;
import com.example.dependencyinjection.model.car.BMWCar;
import com.example.dependencyinjection.model.engine.PetrolEngine;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module
public class AppModule {

    private final Dagger2Application dagger2Application;

    public AppModule(Dagger2Application dagger2Application) {
        this.dagger2Application = dagger2Application;

    }

    @Provides @Singleton
    Dagger2Application provideApp(){
        return dagger2Application;
    }

    @Provides @Singleton
    Engine provideEngine(){
        return new PetrolEngine();
    }

    @Provides @Singleton
    Car provideCar(Engine engine){
        return new BMWCar(engine);
    }
}


