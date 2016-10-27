package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueBioparque extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_bioparque);
        Button Croja = (Button)findViewById(R.id.buttonBio);
        Croja.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         Intent intent = new Intent();
                                         intent.setAction(Intent.ACTION_VIEW);
                                         intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                         intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Bioparque+Estrella/@25.124227,-100.477116,9z/data=!4m5!3m4!1s0x8662bfde7c23fad1:0x9ac132c539f4ea8d!8m2!3d25.1242222!4d-99.9168133"));
                                         startActivity(intent);
                                     }
                                 }

        );
    }

}