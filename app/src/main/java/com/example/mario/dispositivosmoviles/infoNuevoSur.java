package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoNuevoSur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_nuevo_sur);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button NuevoS = (Button)findViewById(R.id.button4);
        NuevoS.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent = new Intent();
                                          intent.setAction(Intent.ACTION_VIEW);
                                          intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                          intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Nuevo+Sur/@25.6533042,-100.2777233,17z/data=!3m1!4b1!4m5!3m4!1s0x8662bf94a8b33fd7:0xd14ad2298ee7cf4!8m2!3d25.6532994!4d-100.2755346"));
                                          startActivity(intent);
                                      }
                                  }

        );

    }

}
