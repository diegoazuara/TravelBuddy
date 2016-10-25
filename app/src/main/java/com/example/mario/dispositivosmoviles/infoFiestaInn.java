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

public class infoFiestaInn extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_fiesta_inn);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonFiestaInn = (Button)findViewById(R.id.button24);
        botonFiestaInn.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 Intent intent = new Intent();
                                                 intent.setAction(Intent.ACTION_VIEW);
                                                 intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                 intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Fiesta+Inn+Monterrey+Tecnol%C3%B3gico/@25.6549478,-100.3277901,13z/data=!4m8!1m2!2m1!1sfiesta+inn+monterrey!3m4!1s0x8662bfc7ef55f7a9:0x6ca9acf43b9c7b54!8m2!3d25.6549478!4d-100.2927712"));
                                                 startActivity(intent);
                                             }
                                         }

        );



    }

}