package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoValleOriente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_valle_oriente);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button ValleO = (Button)findViewById(R.id.button6);

        ValleO.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent();
                                            intent.setAction(Intent.ACTION_VIEW);
                                            intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                            intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Galer%C3%ADas+Valle+Oriente/@25.637413,-100.3167589,15.46z/data=!4m5!3m4!1s0x8662be5046aaaaab:0x95ee983b390e3e83!8m2!3d25.6380679!4d-100.3140006"));
                                            startActivity(intent);
                                        }
                                    }

        );
    }

}
