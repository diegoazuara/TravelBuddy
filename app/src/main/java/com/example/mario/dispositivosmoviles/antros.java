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

public class antros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antros);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton dclub = (ImageButton) findViewById(R.id.dclub);
        dclub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antros.this, infoDclub.class);
                startActivity(intent);
            }
        });

        ImageButton maddox = (ImageButton) findViewById(R.id.maddox);
        maddox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antros.this, infoMaddox.class);
                startActivity(intent);
            }
        });

        ImageButton repu = (ImageButton) findViewById(R.id.republica);
        repu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antros.this, infoRepublica.class);
                startActivity(intent);
            }
        });

        ImageButton press = (ImageButton) findViewById(R.id.press);
        press.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antros.this, infoPress.class);
                startActivity(intent);
            }
        });

        ImageButton strana = (ImageButton) findViewById(R.id.strana);
        strana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antros.this, infoStrana.class);
                startActivity(intent);
            }
        });

        ImageButton barezzito = (ImageButton) findViewById(R.id.barezzito);
        barezzito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antros.this, infoBarezzito.class);
                startActivity(intent);
            }
        });

        ImageButton classico = (ImageButton) findViewById(R.id.classico);
        classico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(antros.this, infoClassico.class);
                startActivity(intent);
            }
        });

    }

}
