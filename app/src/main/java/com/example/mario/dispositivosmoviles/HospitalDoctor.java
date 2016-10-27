package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_doctor);
        Button doctor = (Button)findViewById(R.id.buttonDoctor);
        doctor.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent = new Intent();
                                          intent.setAction(Intent.ACTION_VIEW);
                                          intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                          intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Doctors+Hospital/@25.6846754,-100.3606813,16z/data=!4m5!3m4!1s0x0:0xca4a475242595e70!8m2!3d25.6846731!4d-100.356304"));
                                          startActivity(intent);
                                      }
                                  }

        );



    }

}