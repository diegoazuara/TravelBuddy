package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class cafeterias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafeterias);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton thenada = (ImageButton) findViewById(R.id.thenada);
        thenada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cafeterias.this, infoTheNada.class);
                startActivity(intent);
            }
        });

        ImageButton tierralibre = (ImageButton) findViewById(R.id.tierralibre);
        tierralibre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cafeterias.this, infoTierraLibre.class);
                startActivity(intent);
            }
        });

        ImageButton galeriacafe = (ImageButton) findViewById(R.id.lagaleria);
        galeriacafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cafeterias.this, infoGaleriaCafe.class);
                startActivity(intent);
            }
        });

        ImageButton puntacielo = (ImageButton) findViewById(R.id.puntadelcielo);
        puntacielo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cafeterias.this, infoPuntaCielo.class);
                startActivity(intent);
            }
        });
    }

}
