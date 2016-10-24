package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoLaClamateria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_la_clamateria);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonLaClamateria = (Button)findViewById(R.id.button20);
        botonLaClamateria.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/LA+CLAMATER%C3%8DA+DE+CENTRITO/@25.6996793,-100.3965355,13z/data=!4m8!1m2!2m1!1sla+clamateria+en+monterrey+n.l!3m4!1s0x8662bdee6b4d0aa7:0xffdd5f4ac6d9c2a0!8m2!3d25.65815!4d-100.3654847"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}
