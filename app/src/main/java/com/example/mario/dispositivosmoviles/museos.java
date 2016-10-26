package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class museos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_museos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton museo_del_acero = (ImageButton) findViewById(R.id.museo_del_acero);
        museo_del_acero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(museos.this, infoMuseoDelAcero.class);
                startActivity(intent);
            }
        });

        ImageButton museo_de_historia = (ImageButton) findViewById(R.id.museo_de_historia);
        museo_de_historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(museos.this, infoMuseoDeHistoria.class);
                startActivity(intent);
            }
        });

        ImageButton marco = (ImageButton) findViewById(R.id.marco);
        marco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(museos.this, infoMarco.class);
                startActivity(intent);
            }
        });

        ImageButton museo_del_noreste = (ImageButton) findViewById(R.id.museo_del_noreste);
        museo_del_noreste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(museos.this, infoMuseoDelNoreste.class);
                startActivity(intent);
            }
        });


        ImageButton planetario_alfa = (ImageButton) findViewById(R.id.planetario_alfa);
        planetario_alfa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(museos.this, infoPlanetarioAlfa.class);
                startActivity(intent);
            }
        });

    }

}