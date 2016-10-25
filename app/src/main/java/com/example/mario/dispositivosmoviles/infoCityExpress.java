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

public class infoCityExpress extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_city_express);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonCityExpress = (Button)findViewById(R.id.button33);
        botonCityExpress.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent intent = new Intent();
                                                   intent.setAction(Intent.ACTION_VIEW);
                                                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                   intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Hotel+City+Express+Monterrey+Aeropuerto/@25.7303421,-100.3381246,12z/data=!4m8!1m2!2m1!1scity+express+monterrey!3m4!1s0x86629584a2a5b023:0x4101d9875f81ace2!8m2!3d25.7852603!4d-100.1344422"));
                                                   startActivity(intent);
                                               }
                                           }

        );



    }

}