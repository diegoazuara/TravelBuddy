package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoMuseoDelAcero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_museo_del_acero);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonMuseoDelAcero = (Button)findViewById(R.id.button35);
        botonMuseoDelAcero.setOnClickListener(new View.OnClickListener() {
                                           @Override
                                           public void onClick(View view) {
                                               Intent intent = new Intent();
                                               intent.setAction(Intent.ACTION_VIEW);
                                               intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                               intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Museo+del+Acero+horno3/@25.676103,-100.2847517,17z/data=!3m1!4b1!4m5!3m4!1s0x86629560108add23:0x3288e5f7600a9261!8m2!3d25.676103!4d-100.282563?hl=es-419"));
                                               startActivity(intent);
                                           }
                                       }

        );
    }

}
