package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoSanAgustin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_san_agustin);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button FiestaSa = (Button)findViewById(R.id.button5);

        FiestaSa.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent = new Intent();
                                          intent.setAction(Intent.ACTION_VIEW);
                                          intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                          intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Plaza+Fiesta+San+Agust%C3%ADn/@25.6482866,-100.3494273,14.23z/data=!4m5!3m4!1s0x8662be12c710719d:0xfbb85b9ebf14811f!8m2!3d25.6488171!4d-100.3368312"));
                                          startActivity(intent);
                                      }
                                  }

        );


    }

}
