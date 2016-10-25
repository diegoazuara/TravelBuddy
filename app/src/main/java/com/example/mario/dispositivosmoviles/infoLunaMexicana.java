package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoLunaMexicana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_luna_mexicana);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonLunaMexicana = (Button)findViewById(R.id.button23);
        botonLunaMexicana.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/LUNA+MEXICANA+-+RESTAURANTE/@25.6851136,-100.2642526,17z/data=!3m1!4b1!4m5!3m4!1s0x8662954d138a40a1:0x13ea6dfaa99d3da5!8m2!3d25.6851136!4d-100.2620639"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}
