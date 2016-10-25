package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class restaurantes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton comida_mexicana = (ImageButton) findViewById(R.id.comida_mexicana);
        comida_mexicana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(restaurantes.this, comidaMexicana.class);
                startActivity(intent);
            }
        });

        ImageButton comida_brasileira = (ImageButton) findViewById(R.id.comida_brasileira);
        comida_brasileira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(restaurantes.this, comidaBrasileira.class);
                startActivity(intent);
            }
        });
    }

}
