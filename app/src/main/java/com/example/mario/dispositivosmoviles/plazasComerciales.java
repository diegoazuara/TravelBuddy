package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class plazasComerciales extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plazas_comerciales);


        ImageButton plazacumbres = (ImageButton) findViewById(R.id.plazacumbres);
        plazacumbres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(plazasComerciales.this, infoPlazaCumbres.class);
                startActivity(intent);
            }
        });

    }

}
