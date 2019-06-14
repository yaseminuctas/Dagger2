package com.example.dependencyinjection.views;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dependencyinjection.Dagger2Application;
import com.example.dependencyinjection.R;
import com.example.dependencyinjection.model.Car;

import javax.inject.Inject;
import dagger.android.support.DaggerAppCompatActivity;


public class CarActivity extends AppCompatActivity {

    @Inject
    Car car;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        inject();

        car.start();
        car.stop();

    }

    private void inject(){
        Dagger2Application application = (Dagger2Application) getApplication();
        application.getAppComponent().inject(this);
    }


}
