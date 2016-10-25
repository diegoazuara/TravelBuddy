package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.net.URL;

public class infoQualityInn extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_quality_inn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonQualityyInn = (Button)findViewById(R.id.button32);
        botonQualityyInn.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent intent = new Intent();
                                                   intent.setAction(Intent.ACTION_VIEW);
                                                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                   intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Quality+Inn/@25.7060638,-100.227048,17z/data=!3m1!4b1!4m5!3m4!1s0x8662eaf2c19d8af5:0x89aa481092887036!8m2!3d25.7060638!4d-100.2248593"));
                                                   startActivity(intent);
                                               }
                                           }

        );



    }

}