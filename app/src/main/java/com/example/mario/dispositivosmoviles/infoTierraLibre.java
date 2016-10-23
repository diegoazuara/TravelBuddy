package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoTierraLibre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_tierra_libre);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonTierraLibre = (Button)findViewById(R.id.button8);

        botonTierraLibre.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent = new Intent();
                                                intent.setAction(Intent.ACTION_VIEW);
                                                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Tierra+Libre/@25.6644534,-100.3094077,15.15z/data=!4m5!3m4!1s0x8662be2ceaf165d5:0x2bccec297f5a3b4f!8m2!3d25.668283!4d-100.3063591?hl=es-419"));
                                                startActivity(intent);
                                            }
                                        }

        );
    }

}
