package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoGaleriaCafe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_galeria_cafe);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonGaleriaCafe = (Button)findViewById(R.id.button9);

        botonGaleriaCafe.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent = new Intent();
                                                intent.setAction(Intent.ACTION_VIEW);
                                                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                intent.setData(Uri.parse("https://www.google.com.mx/maps/place/La+Galer%C3%ADa+Caf%C3%A9/@25.6663039,-100.3096961,17z/data=!3m1!4b1!4m5!3m4!1s0x8662be2d00d5e9b3:0x73d4020b1c449d11!8m2!3d25.6663039!4d-100.3075074?hl=es-419"));
                                                startActivity(intent);
                                            }
                                        }

        );
    }

}
