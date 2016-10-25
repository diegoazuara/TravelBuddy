package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.net.URL;

public class infoLQHotel extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_lq_hotel);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonLQHotel = (Button)findViewById(R.id.button34);
        botonLQHotel.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent intent = new Intent();
                                                   intent.setAction(Intent.ACTION_VIEW);
                                                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                   intent.setData(Uri.parse("https://www.google.com.mx/maps/place/La+Quinta+Inn+%26+Suites+Monterrey+Norte/@25.7202624,-100.3386346,18z/data=!4m5!3m4!1s0x0:0xfc5dd663ee5a3095!8m2!3d25.720685!4d-100.337715"));
                                                   startActivity(intent);
                                               }
                                           }

        );



    }

}