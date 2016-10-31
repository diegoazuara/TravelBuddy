package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class bancos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bancos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button Llamar = (Button) findViewById(R.id.llamar_bbva);
        Llamar.setOnClickListener(new View.OnClickListener() {

                                      public void onClick(View view) {
                                          Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                          callIntent.setData(Uri.parse("tel:81579111"));
                                          startActivity(callIntent);
                                      }
                                  }

        );

        Button Llamar2 = (Button) findViewById(R.id.llamar_banorte);
        Llamar2.setOnClickListener(new View.OnClickListener() {

                                       public void onClick(View view) {
                                           Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                           callIntent.setData(Uri.parse("tel:83302901"));
                                           startActivity(callIntent);
                                       }
                                   }

        );

        Button Llamar3 = (Button) findViewById(R.id.llamar_banamex);
        Llamar3.setOnClickListener(new View.OnClickListener() {

                                       public void onClick(View view) {
                                           Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                           callIntent.setData(Uri.parse("tel:018000212345"));
                                           startActivity(callIntent);
                                       }
                                   }

        );


        Button Llamar4 = (Button) findViewById(R.id.llamar_santander);
        Llamar4.setOnClickListener(new View.OnClickListener() {

                                       public void onClick(View view) {
                                           Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                           callIntent.setData(Uri.parse("tel:018005010000"));
                                           startActivity(callIntent);
                                       }
                                   }

        );


    }

}
