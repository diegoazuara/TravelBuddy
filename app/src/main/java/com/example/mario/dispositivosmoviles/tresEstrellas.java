package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class tresEstrellas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tres_estrellas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton best_western = (ImageButton) findViewById(R.id.best_western);
        best_western.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tresEstrellas.this, infoBestWestern.class);
                startActivity(intent);
            }
        });

        ImageButton quality_inn = (ImageButton) findViewById(R.id.quality_inn);
        quality_inn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tresEstrellas.this, infoQualityInn.class);
                startActivity(intent);
            }
        });

        ImageButton city_express = (ImageButton) findViewById(R.id.city_express);
        city_express.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tresEstrellas.this, infoCityExpress.class);
                startActivity(intent);
            }
        });

        ImageButton lq_hotel = (ImageButton) findViewById(R.id.lq_hotel);
        lq_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tresEstrellas.this, infoLQHotel.class);
                startActivity(intent);
            }
        });




    }

}