package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class plazasComerciales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plazas_comerciales);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton plazacumbres = (ImageButton) findViewById(R.id.plazacumbres);
        plazacumbres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plazasComerciales.this, infoPlazaCumbres.class);
                startActivity(intent);
            }
        });

        ImageButton nuevosur = (ImageButton) findViewById(R.id.nuevosur);
        nuevosur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plazasComerciales.this, infoNuevoSur.class);
                startActivity(intent);
            }
        });

        ImageButton sanagustin = (ImageButton) findViewById(R.id.sanagustin);
        sanagustin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plazasComerciales.this, infoSanAgustin.class);
                startActivity(intent);
            }
        });

        ImageButton valleoriente = (ImageButton) findViewById(R.id.valleoriente);
        valleoriente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plazasComerciales.this, infoValleOriente.class);
                startActivity(intent);
            }
        });

    }

}
