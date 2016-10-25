package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class hoteles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final ImageButton cincoEstrellas = (ImageButton) findViewById(R.id.cinco_estrellas);
        cincoEstrellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoteles.this, com.example.mario.dispositivosmoviles.cincoEstrellas.class);
                startActivity(intent);
            }
        });

        ImageButton cuatroEstrellas = (ImageButton) findViewById(R.id.cuatro_estrellas);
        cuatroEstrellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoteles.this, com.example.mario.dispositivosmoviles.cuatroEstrellas.class);
                startActivity(intent);
            }
        });

        ImageButton tresEstrellas = (ImageButton) findViewById(R.id.tres_estrellas);
        tresEstrellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(hoteles.this, com.example.mario.dispositivosmoviles.tresEstrellas.class);
                startActivity(intent);
            }
        });
    }

}
