package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class bares extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton mostacho = (ImageButton) findViewById(R.id.sr_mostacho);
        mostacho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bares.this, srMostachoInfo.class);
                startActivity(intent);
            }
        });

        ImageButton la_macarena = (ImageButton) findViewById(R.id.la_macarena);
        la_macarena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bares.this, infoLaMacarena.class);
                startActivity(intent);
            }
        });

        ImageButton el_costenito = (ImageButton) findViewById(R.id.el_costenito);
        el_costenito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bares.this, infoElCostenito.class);
                startActivity(intent);
            }
        });

        ImageButton la_clama = (ImageButton) findViewById(R.id.la_clamateria);
        la_clama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bares.this, infoLaClamateria.class);
                startActivity(intent);
            }
        });

        ImageButton la_coqueta = (ImageButton) findViewById(R.id.la_coqueta);
        la_coqueta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bares.this, infoLaCoqueta.class);
                startActivity(intent);
            }
        });

        ImageButton la_shoteria = (ImageButton) findViewById(R.id.la_shoteria);
        la_shoteria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(bares.this, infoLaShoteria.class);
                startActivity(intent);
            }
        });
    }

}
