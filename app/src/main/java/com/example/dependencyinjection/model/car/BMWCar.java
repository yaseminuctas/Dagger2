package com.example.dependencyinjection.model.car;

import android.util.Log;

import com.example.dependencyinjection.model.Car;
import com.example.dependencyinjection.model.Engine;

import javax.inject.Inject;

public class BMWCar implements Car {

    Engine engine;

    @Inject
    public BMWCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        Log.d("DaggerExample","BMW Car is about to start.");
        engine.turnOn();
    }

    @Override
    public void stop() {
        Log.d("DaggerExample","BMW Car is about to stop.");
        engine.turnOff();
    }
}
