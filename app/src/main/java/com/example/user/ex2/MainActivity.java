package com.example.user.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(MyApp.MY_TAG, "Main: OnStop event");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MyApp.MY_TAG, "Main: OnPause event");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(MyApp.MY_TAG, "Main: OnDestroy event");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(MyApp.MY_TAG, "Main: OnRestart event");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MyApp.MY_TAG, "Main: OnCreate event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MyApp.MY_TAG, "Main: OnCreate event");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MyApp.MY_TAG, "Main: OnCreate event");
        setContentView(R.layout.activity_main);
    }
}
