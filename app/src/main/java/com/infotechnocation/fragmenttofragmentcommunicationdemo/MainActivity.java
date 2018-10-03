package com.infotechnocation.fragmenttofragmentcommunicationdemo;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements OnDataEntryListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void ondataentered(String data) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        DisplayDataFragment  displayDataFragment= (DisplayDataFragment)fragmentManager.findFragmentById(R.id.fragmentDisplayData);
        displayDataFragment.setData(data);

    }
}
