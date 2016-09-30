package com.example.user.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final String KEY_COUNT = "count";
    Button button;
    private int pressCounter;
    EditText editText;
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
        Log.i(MyApp.MY_TAG, "Main: OnStart event");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MyApp.MY_TAG, "Main: OnResune event");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(MyApp.MY_TAG, "Main: OnCreate event");
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(MyApp.MY_TAG, "Main: onSaveInstanceState event");
        outState.putInt(KEY_COUNT, this.pressCounter);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState!=null)
        {
            this.pressCounter = savedInstanceState.getInt(KEY_COUNT, 0);
        }
        Log.i(MyApp.MY_TAG, "Main: onRestoreInstanceState event");
    }

    public void displayMessage(View view){
        pressCounter++;
        button = (Button)findViewById(R.id.button2);
        editText = (EditText)findViewById(R.id.editText);
        String text = editText.getText().toString();
        String message;
        if(text.isEmpty())
        {
            message =getResources().getString(R.string.emptyName);
            Toast.makeText(this, String.format(message,pressCounter),Toast.LENGTH_SHORT).show();
        }
        else
        {
            message = getResources().getString(R.string.Name1);
            String s1 = String.format(message, pressCounter,text);
            Toast.makeText(this, s1,Toast.LENGTH_SHORT).show();
        }
    }
}
