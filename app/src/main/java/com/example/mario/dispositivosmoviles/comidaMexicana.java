package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class comidaMexicana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comida_mexicana);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton luna_mexicana = (ImageButton) findViewById(R.id.luna_mexicana);
        luna_mexicana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaMexicana.this, infoLunaMexicana.class);
                startActivity(intent);
            }
        });

        ImageButton los_frijoles = (ImageButton) findViewById(R.id.los_frijoles);
        los_frijoles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaMexicana.this, infoLosFrijoles.class);
                startActivity(intent);
            }
        });
        ImageButton san_carlos = (ImageButton) findViewById(R.id.san_carlos);
        san_carlos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaMexicana.this, infoSanCarlos.class);
                startActivity(intent);
            }
        });

        ImageButton los_cabritos = (ImageButton) findViewById(R.id.los_cabritos);
        los_cabritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaMexicana.this, infoLosCabritos.class);
                startActivity(intent);
            }
        });

        ImageButton taqueria_juarez = (ImageButton) findViewById(R.id.taqueria_juarez);
        taqueria_juarez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaMexicana.this, infoTaqueriaJuarez.class);
                startActivity(intent);
            }
        });

        ImageButton la_jarochita = (ImageButton) findViewById(R.id.la_jarochita);
        la_jarochita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(comidaMexicana.this, infoLaJarochita.class);
                startActivity(intent);
            }
        });

    }

}
