package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class infoMuseoDelNoreste extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_museo_del_noreste);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Button botonMuseoDelNoreste = (Button)findViewById(R.id.button37);
        botonMuseoDelNoreste.setOnClickListener(new View.OnClickListener() {
                                                  @Override
                                                  public void onClick(View view) {
                                                      Intent intent = new Intent();
                                                      intent.setAction(Intent.ACTION_VIEW);
                                                      intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                                      intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Museo+del+Noreste/@25.670823,-100.306752,15z/data=!4m5!3m4!1s0x0:0x1511695eae2b2050!8m2!3d25.670823!4d-100.306752?sa=X&ved=0ahUKEwiLqKeK0PfPAhWP0YMKHX0IB3gQ_BIIfjAO"));
                                                      startActivity(intent);
                                                  }
                                              }

        );
    }

}
