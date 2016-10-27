package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueEspana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_espana);
        Button espana = (Button)findViewById(R.id.buttonEspana);
        espana.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Intent intent = new Intent();
                                          intent.setAction(Intent.ACTION_VIEW);
                                          intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                          intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Parque+Espa%C3%B1a/@25.6719931,-100.5601455,10z/data=!4m5!3m4!1s0x8662bfe0d4a803f7:0xe7b494561a91794f!8m2!3d25.6719883!4d-100.2799941"));
                                          startActivity(intent);
                                      }
                                  }

        );
    }

}