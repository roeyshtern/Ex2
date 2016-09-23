package com.example.user.ex2;

import android.app.Application;
import android.util.Log;

/**
 * Created by User on 9/23/2016.
 */
public class MyApp extends Application{
    public final static String MY_TAG = "MyApp: ";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(MY_TAG, "App: OnCreate event");
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        Log.i(MY_TAG, "App: OnTerminate event");
    }
}
