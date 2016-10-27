package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueCaballo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_caballo);
        Button caballo = (Button)findViewById(R.id.buttonCaballo);
        caballo.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent();
                                           intent.setAction(Intent.ACTION_VIEW);
                                           intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                           intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Cola+de+Caballo,+67300+Santiago,+N.L./@25.6600788,-100.4062785,10z/data=!4m5!3m4!1s0x8662cc3bca3bce09:0xbab1b5dafdf4793e!8m2!3d25.3923982!4d-100.1412333"));
                                           startActivity(intent);
                                       }
                                   }

        );
    }

}