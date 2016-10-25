package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoLaJarochita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_la_jarochita);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonJaro = (Button)findViewById(R.id.button28);
        botonJaro.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/La+Jarochita/@25.6486552,-100.2984595,17z/data=!3m1!4b1!4m5!3m4!1s0x140d7dec61769f7d:0x6670fa3d59e0de6d!8m2!3d25.6486552!4d-100.2962708"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}
