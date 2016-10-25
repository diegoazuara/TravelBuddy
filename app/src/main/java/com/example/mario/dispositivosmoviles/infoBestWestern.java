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

public class infoBestWestern extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_best_western);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonBestWestern = (Button)findViewById(R.id.button31);
        botonBestWestern.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent = new Intent();
                                                intent.setAction(Intent.ACTION_VIEW);
                                                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Best+Western+Centro+Monterrey/@25.6774261,-100.3172554,15z/data=!4m8!1m2!2m1!1sbest+western!3m4!1s0x8662959be7d55635:0x7aa29dd593c30b51!8m2!3d25.6783232!4d-100.3137338"));
                                                startActivity(intent);
                                            }
                                        }

        );



    }

}