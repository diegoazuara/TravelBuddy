package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoSanCarlos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_san_carlos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonSanCarlos = (Button)findViewById(R.id.button25);
        botonSanCarlos.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/San+Carlos/@25.6669594,-100.3437977,17z/data=!3m1!4b1!4m5!3m4!1s0x8662be047eff872f:0x2d7763875b3bbce8!8m2!3d25.6669594!4d-100.341609"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}
