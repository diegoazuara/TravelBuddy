package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HospitalOca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospital_oca);
        Button Hoca = (Button)findViewById(R.id.buttonOca);
        Hoca.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        Intent intent = new Intent();
                                        intent.setAction(Intent.ACTION_VIEW);
                                        intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                        intent.setData(Uri.parse("https://www.google.com.mx/maps/place/OCA+Hospital/@25.6815712,-101.43858,8z/data=!4m5!3m4!1s0x8662958f2e176a1f:0xfb2ab80e8951dce1!8m2!3d25.6815664!4d-100.3179745"));
                                        startActivity(intent);
                                    }
                                }

        );
    }

}