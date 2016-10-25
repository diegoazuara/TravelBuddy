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

public class cincoEstrellas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco_estrellas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton live_aqua = (ImageButton) findViewById(R.id.live_aqua);
        live_aqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cincoEstrellas.this, infoLiveAqua.class);
                startActivity(intent);
            }
        });

        ImageButton fiesta_inn = (ImageButton) findViewById(R.id.fiesta_inn);
        fiesta_inn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cincoEstrellas.this, infoFiestaInn.class);
                startActivity(intent);
            }
        });

        ImageButton safi = (ImageButton) findViewById(R.id.safi);
        safi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cincoEstrellas.this, infoSafi.class);
                startActivity(intent);
            }
        });

        ImageButton krystal = (ImageButton) findViewById(R.id.krystal);
        krystal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cincoEstrellas.this, infoKrystal.class);
                startActivity(intent);
            }
        });




    }

}
