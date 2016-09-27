package com.example.user.ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

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
    public void displayMessage(View view){
        pressCounter++;
        button = (Button)findViewById(R.id.button2);
        editText = (EditText)findViewById(R.id.editText);
        String text = editText.getText().toString();
        String message;
        if(text.isEmpty())
        {
            message =getResources().getString(R.string.emptyName);
            Toast.makeText(this, message,Toast.LENGTH_SHORT).show();
        }
        else
        {
            message = getResources().getString(R.string.Name1);
            String s1 = String.format(message, text);
            Toast.makeText(this, s1,Toast.LENGTH_SHORT).show();
        }
    }
}
