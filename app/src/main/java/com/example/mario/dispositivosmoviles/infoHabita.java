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

public class infoHabita extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_habita);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonHabita = (Button)findViewById(R.id.button29);
        botonHabita.setOnClickListener(new View.OnClickListener() {
                                               @Override
                                               public void onClick(View view) {
                                                   Intent intent = new Intent();
                                                   intent.setAction(Intent.ACTION_VIEW);
                                                   intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                   intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Habita+Monterrey+Hotel/@25.6514788,-100.3680159,15z/data=!4m5!3m4!1s0x0:0x7f2d7adeed052cdf!8m2!3d25.6514788!4d-100.3680159?sa=X&ved=0ahUKEwjnsr6P0PbPAhVl7YMKHTwFBkcQ_BIIlQEwEg"));
                                                   startActivity(intent);
                                               }
                                           }

        );



    }

}