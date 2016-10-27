package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ParqueHuasteca extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parque_huasteca);
        Button huasteca = (Button)findViewById(R.id.buttonHuasteca);
        huasteca.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            Intent intent = new Intent();
                                            intent.setAction(Intent.ACTION_VIEW);
                                            intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                            intent.setData(Uri.parse("https://www.google.com.mx/maps/place/Parque+La+Huasteca/@25.6494192,-100.5908119,11z/data=!4m5!3m4!1s0x8662a2b09a34c809:0x306c43290c0fbfc1!8m2!3d25.6494144!4d-100.4507362"));
                                            startActivity(intent);
                                        }
                                    }

        );
    }

}