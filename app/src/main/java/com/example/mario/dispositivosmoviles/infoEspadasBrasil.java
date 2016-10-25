package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoEspadasBrasil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_espadas_brasil);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonEspadas = (Button)findViewById(R.id.button31);
        botonEspadas.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Espadas+Brasilenas+Monterrey/@25.6559724,-100.3892838,17z/data=!3m1!4b1!4m5!3m4!1s0x8662bd9b10214429:0xd66882d148af5a8d!8m2!3d25.6559724!4d-100.3870951"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}
