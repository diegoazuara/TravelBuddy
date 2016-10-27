package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalUni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_uni);
        Button Croja = (Button)findViewById(R.id.buttonHuni);
        Croja.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent();
                                         intent.setAction(Intent.ACTION_VIEW);
                                         intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                         intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Hospital+Universitario+Dr.+Jos%C3%A9+Eleuterio+Gonzalez/@25.688768,-100.3517581,17z/data=!3m1!4b1!4m5!3m4!1s0x866295e3ad170c2d:0x5f52165d7842c884!8m2!3d25.6887632!4d-100.3495694"));
                                         startActivity(intent);
                                     }
                                 }

        );
    }

}