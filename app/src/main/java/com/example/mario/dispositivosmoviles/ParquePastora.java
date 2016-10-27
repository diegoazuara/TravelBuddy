package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParquePastora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_pastora);
        Button pastora = (Button)findViewById(R.id.buttonPastora);
        pastora.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent();
                                           intent.setAction(Intent.ACTION_VIEW);
                                           intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                           intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Zool%C3%B3gico+La+Pastora/@25.6653528,-100.5279434,10z/data=!4m5!3m4!1s0x8662c0100980ccb7:0xe5a7c89eea2a4d70!8m2!3d25.665348!4d-100.247792"));
                                           startActivity(intent);
                                       }
                                   }

        );
    }

}