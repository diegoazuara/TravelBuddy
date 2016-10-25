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

public class cuatroEstrellas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuatro_estrellas);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton holiday_inn = (ImageButton) findViewById(R.id.holiday_inn);
        holiday_inn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cuatroEstrellas.this, infoHolidayInn.class);
                startActivity(intent);
            }
        });

        ImageButton antaris = (ImageButton) findViewById(R.id.antaris);
        antaris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cuatroEstrellas.this, infoAntaris.class);
                startActivity(intent);
            }
        });

        ImageButton habita = (ImageButton) findViewById(R.id.habita);
        habita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cuatroEstrellas.this, infoHabita.class);
                startActivity(intent);
            }
        });

        ImageButton four_points = (ImageButton) findViewById(R.id.four_points);
        four_points.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(cuatroEstrellas.this, infoFourPoints.class);
                startActivity(intent);
            }
        });




    }

}