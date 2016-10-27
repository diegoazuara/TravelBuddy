package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalCroja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_croja);
        Button Croja = (Button)findViewById(R.id.buttonCroja);
        Croja.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent();
                                         intent.setAction(Intent.ACTION_VIEW);
                                         intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                         intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Cruz+Roja+Mexicana+Delegaci%C3%B3n+Monterrey/@25.686805,-100.3283892,14z/data=!4m8!1m2!2m1!1scruz+roja!3m4!1s0x0:0x13f13737f04654e6!8m2!3d25.6982503!4d-100.3161836"));
                                         startActivity(intent);
                                     }
                                 }

        );
    }

}