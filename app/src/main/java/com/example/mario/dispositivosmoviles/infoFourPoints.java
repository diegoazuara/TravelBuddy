package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.net.URL;

public class infoFourPoints extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_four_points);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonFourPoints = (Button)findViewById(R.id.button30);
        botonFourPoints.setOnClickListener(new View.OnClickListener() {
                                              @Override
                                              public void onClick(View view) {
                                                  Intent intent = new Intent();
                                                  intent.setAction(Intent.ACTION_VIEW);
                                                  intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                  intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Hotel+Four+Points+Galer%C3%ADas+Monterrey/@25.6832671,-100.3552518,15z/data=!4m5!3m4!1s0x0:0xe41aa52f6176077f!8m2!3d25.6832671!4d-100.3552518?sa=X&ved=0ahUKEwjKqsag1vbPAhUm4IMKHcDpAqUQ_BIIhwEwCg"));
                                                  startActivity(intent);
                                              }
                                          }

        );



    }

}