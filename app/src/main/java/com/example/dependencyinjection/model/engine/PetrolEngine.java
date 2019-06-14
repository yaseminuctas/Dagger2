package com.example.dependencyinjection.model.engine;

import android.util.Log;

import com.example.dependencyinjection.model.Engine;

public class PetrolEngine implements Engine {
    @Override
    public void turnOn() {
        Log.d("DaggerExample ", "Benzin Motor kullanılıyor");
    }

    @Override
    public void turnOff() {
        Log.d("DaggerExample ", "Benzin Motor durduruldu");
    }
}
