package com.example.mario.dispositivosmoviles;

import android.app.ActionBar;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

public class infoMaddox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_maddox);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
