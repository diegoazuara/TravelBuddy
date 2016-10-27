package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueNinosHeroes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_ninos_heroes);
        Button nheroes = (Button)findViewById(R.id.buttonNheroes);
        nheroes.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent = new Intent();
                                           intent.setAction(Intent.ACTION_VIEW);
                                           intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                           intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Parque+Ni%C3%B1os+H%C3%A9roes,+Monterrey,+N.L./@25.7155076,-100.4534374,11z/data=!4m5!3m4!1s0x866295ae7d709411:0xb62a4f4df8dd8254!8m2!3d25.7174307!4d-100.3147096"));
                                           startActivity(intent);
                                       }
                                   }

        );
    }

}