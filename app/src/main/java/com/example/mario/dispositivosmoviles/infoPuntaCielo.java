package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoPuntaCielo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_punta_cielo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Button botonPuntaCielo = (Button)findViewById(R.id.button10);

        botonPuntaCielo.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent = new Intent();
                                                intent.setAction(Intent.ACTION_VIEW);
                                                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Caf%C3%A9+Punta+Del+Cielo+Monterrey+Macroplaza/@25.6751503,-100.3366002,13.31z/data=!4m8!1m2!2m1!1scafe+punta+del+cielo!3m4!1s0x0:0x9ff5dccc3cefedbc!8m2!3d25.6691278!4d-100.3085339?hl=es-419"));
                                                startActivity(intent);
                                            }
                                        }

        );
    }

}
