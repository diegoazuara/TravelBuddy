package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoMaddox extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_maddox);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonMaddox = (Button)findViewById(R.id.button11);
        botonMaddox.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View view) {
                                              Intent intent = new Intent();
                                              intent.setAction(Intent.ACTION_VIEW);
                                              intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                              intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Maddox/@25.649504,-100.3585959,18.25z/data=!4m8!1m2!2m1!1sMaddox+Avenida+Roble,+66265+San+Pedro+Garza+Garc%C3%ADa!3m4!1s0x0:0x12d7f38f7c50bf0c!8m2!3d25.6494051!4d-100.3578869"));
                                              startActivity(intent);
                                          }
                                      }

        );
    }

}
