package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoLosFrijoles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_los_frijoles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonLosFrijoles = (Button)findViewById(R.id.button24);
        botonLosFrijoles.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Los+Frijoles/@25.6778867,-100.3147469,17z/data=!3m1!4b1!4m5!3m4!1s0x866295871d2abd6d:0x2b73abef4564c014!8m2!3d25.6778867!4d-100.3125582"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}
