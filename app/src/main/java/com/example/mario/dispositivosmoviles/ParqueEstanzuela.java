package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueEstanzuela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_estanzuela);
        Button estanzuela = (Button)findViewById(R.id.buttonEstanzuela);
        estanzuela.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Parque+Natural+La+Estanzuela/@25.5498606,-100.8306902,9z/data=!4m5!3m4!1s0x8662b888c90533d5:0xe66c841285d93d8b!8m2!3d25.5498558!4d-100.2703875"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}