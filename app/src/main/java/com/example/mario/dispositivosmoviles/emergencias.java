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

public class emergencias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergencia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button Llamar = (Button) findViewById(R.id.llamar_cruz_roja);
        Llamar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:14771477"));
                startActivity(callIntent);
                                      }
                                  }

        );

        Button Llamar2 = (Button) findViewById(R.id.llamar_centro_emergencias);
        Llamar2.setOnClickListener(new View.OnClickListener() {

                                      public void onClick(View view) {
                                          Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                          callIntent.setData(Uri.parse("tel:066"));
                                          startActivity(callIntent);
                                      }
                                  }

        );

        Button Llamar3 = (Button) findViewById(R.id.llamar_bomberos);
        Llamar3.setOnClickListener(new View.OnClickListener() {

                                       public void onClick(View view) {
                                           Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                           callIntent.setData(Uri.parse("tel:83420053 "));
                                           startActivity(callIntent);
                                       }
                                   }

        );


        Button Llamar4 = (Button) findViewById(R.id.llamar_civil);
        Llamar4.setOnClickListener(new View.OnClickListener() {

                                       public void onClick(View view) {
                                           Intent callIntent = new Intent(Intent.ACTION_DIAL);
                                           callIntent.setData(Uri.parse("tel:83431116"));
                                           startActivity(callIntent);
                                       }
                                   }

        );


    }

}
