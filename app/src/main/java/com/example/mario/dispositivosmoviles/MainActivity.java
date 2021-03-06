package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.graphics.Path;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ImageButton restaurants = (ImageButton) findViewById(R.id.nocturno);
        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, vidaNocturna.class);
                startActivity(intent);
            }
        });

        ImageButton hoteles = (ImageButton) findViewById(R.id.hoteles);
        hoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, hoteles.class);
                startActivity(intent);
            }
        });

        ImageButton plazascomerciales = (ImageButton) findViewById(R.id.plazascomerciales);
        plazascomerciales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, plazasComerciales.class);
                startActivity(intent);
            }
        });

        ImageButton cafe = (ImageButton) findViewById(R.id.cafe);
        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cafeterias.class);
                startActivity(intent);
            }
        });

        ImageButton restaurantes = (ImageButton) findViewById(R.id.restaurants);
        restaurantes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, restaurantes.class);
                startActivity(intent);
            }
        });

        ImageButton museos = (ImageButton) findViewById(R.id.museos);
        museos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, museos.class);
                startActivity(intent);
            }
        });
        ImageButton hospitales = (ImageButton) findViewById(R.id.hospitales);
        hospitales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Hospitales.class);
                startActivity(intent);
            }
        });
        ImageButton parques = (ImageButton) findViewById(R.id.parques);
        parques.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Parques.class);
                startActivity(intent);
            }
        });

        ImageButton directorio = (ImageButton) findViewById(R.id.directorio);
        directorio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, directorio.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
