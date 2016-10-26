package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoMarco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_marco);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonMarco = (Button)findViewById(R.id.button37);
        botonMarco.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new Intent();
                                                      intent.setAction(Intent.ACTION_VIEW);
                                                      intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                      intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Museo+MARCO/@25.664985,-100.3120724,17z/data=!3m1!4b1!4m5!3m4!1s0x8662be2e03fe39fd:0xbb7e3b710c501bb4!8m2!3d25.664985!4d-100.3098837?hl=es-419"));
                                                      startActivity(intent);
                                                  }
                                              }

        );
    }

}
