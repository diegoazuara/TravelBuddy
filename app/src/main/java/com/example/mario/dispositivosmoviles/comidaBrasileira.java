package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class comidaBrasileira extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida_brasileira);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton picanha = (ImageButton) findViewById(R.id.picanha_brasileira);
        picanha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaBrasileira.this, infoPicanha.class);
                startActivity(intent);
            }
        });

        ImageButton vira = (ImageButton) findViewById(R.id.viravira);
        vira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaBrasileira.this, infoVira.class);
                startActivity(intent);
            }
        });

        ImageButton espadas = (ImageButton) findViewById(R.id.espadas_brasileiras);
        espadas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaBrasileira.this, infoEspadasBrasil.class);
                startActivity(intent);
            }
        });

        ImageButton pampas = (ImageButton) findViewById(R.id.mr_pampas);
        pampas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaBrasileira.this, infoMrPampas.class);
                startActivity(intent);
            }
        });
    }

}
