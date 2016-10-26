package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoMuseoDeHistoria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_museo_de_historia);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonMuseoDeHistoria = (Button)findViewById(R.id.button36);
        botonMuseoDeHistoria.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new Intent();
                                                      intent.setAction(Intent.ACTION_VIEW);
                                                      intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                      intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Museo+de+Historia+Mexicana/@25.6761019,-100.3000726,14z/data=!4m8!1m2!2m1!1smuseo+de+historia!3m4!1s0x8662be2b4088a38f:0x5f5d2e5119dcc9b!8m2!3d25.671558!4d-100.306441?hl=es-419"));
                                                      startActivity(intent);
                                                  }
                                              }

        );
    }

}
