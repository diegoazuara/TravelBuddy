package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueFundidora extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_fundidora);
        Button Croja = (Button)findViewById(R.id.buttonFundidora);
        Croja.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent();
                                         intent.setAction(Intent.ACTION_VIEW);
                                         intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                         intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Parque+Fundidora/@25.6787085,-100.5644525,10z/data=!4m5!3m4!1s0x86629561ff265483:0x1b7bd40783c3a9a8!8m2!3d25.6787037!4d-100.2843011"));
                                         startActivity(intent);
                                     }
                                 }

        );
    }

}