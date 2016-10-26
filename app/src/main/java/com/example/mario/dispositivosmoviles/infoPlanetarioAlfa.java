package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoPlanetarioAlfa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_planetario_alfa);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonPlanetarioAlfa = (Button)findViewById(R.id.button38);
        botonPlanetarioAlfa.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new Intent();
                                                      intent.setAction(Intent.ACTION_VIEW);
                                                      intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                      intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Planetario+Alfa/@25.636454,-100.357889,15z/data=!4m5!3m4!1s0x0:0x1597c9d68305a125!8m2!3d25.636454!4d-100.357889?sa=X&ved=0ahUKEwjppqz_0ffPAhXBy4MKHRApAVIQ_BIIfjAQ"));
                                                      startActivity(intent);
                                                  }
                                              }

        );
    }

}
