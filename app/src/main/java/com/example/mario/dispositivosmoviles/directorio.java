package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class directorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directorio);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton emergencias = (ImageButton) findViewById(R.id.emergencia);
        emergencias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(directorio.this, emergencias.class);
                startActivity(intent);
            }
        });

        ImageButton servicios = (ImageButton) findViewById(R.id.servicios);
        servicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(directorio.this, servicios.class);
                startActivity(intent);
            }
        });

        ImageButton bancos = (ImageButton) findViewById(R.id.bancos);
        bancos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(directorio.this, bancos.class);
                startActivity(intent);
            }
        });


    }

}
