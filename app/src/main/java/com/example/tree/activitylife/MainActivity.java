package com.example.tree.activitylife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","Hello World! --onCreate()--");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i("MainActivityLife","--onStart()--");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivityLife","--onResume()--");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivityLife","--onPause()--");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivityLife","--onStop()--");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivityLife","--onDestroy()--");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("MainActivityLife","--onRestart()--");
    }
}
