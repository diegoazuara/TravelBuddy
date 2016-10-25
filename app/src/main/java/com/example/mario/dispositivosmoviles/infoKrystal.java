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

public class infoKrystal extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_krystal);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonKrystal = (Button)findViewById(R.id.button26);
        botonKrystal.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  Intent intent = new Intent();
                                                  intent.setAction(Intent.ACTION_VIEW);
                                                  intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                  intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Hotel+Krystal+Monterrey/@25.666666,-100.311785,15z/data=!4m5!3m4!1s0x0:0x5c4cd6b94c62ed2d!8m2!3d25.666666!4d-100.311785?sa=X&ved=0ahUKEwishZiVnvXPAhXC24MKHV2PAbQQ_BIIiQEwDg"));
                                                  startActivity(intent);
                                              }
                                          }

        );



    }

}