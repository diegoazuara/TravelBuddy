package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueChipinque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_chipinque);
        Button chipinque = (Button)findViewById(R.id.buttonChipinque);
        chipinque.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             Intent intent = new Intent();
                                             intent.setAction(Intent.ACTION_VIEW);
                                             intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                             intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Parque+Ecol%C3%B3gico+Chipinque/@25.6084514,-100.4966496,11z/data=!4m5!3m4!1s0x8662bc24126e47dd:0xee0d395933b0ac0a!8m2!3d25.6084466!4d-100.3565739"));
                                             startActivity(intent);
                                         }
                                     }

        );
    }

}