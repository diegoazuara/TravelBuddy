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

public class infoSafi extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_safi);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonSafi = (Button)findViewById(R.id.button25);
        botonSafi.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent intent = new Intent();
                                                 intent.setAction(Intent.ACTION_VIEW);
                                                 intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                 intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Hotel+Safi+Valle/@25.6547051,-100.3422218,15z/data=!4m12!1m6!3m5!1s0x8662be6cca78fd73:0x1d3728380b804857!2sHotel+Safi+Valle!8m2!3d25.6498932!4d-100.3341235!3m4!1s0x8662be6cca78fd73:0x1d3728380b804857!8m2!3d25.6498932!4d-100.3341235"));
                                                 startActivity(intent);
                                             }
                                         }

        );



    }

}