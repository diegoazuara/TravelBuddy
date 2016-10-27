package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Hospitales extends AppCompatActivity {
    GridViewAdapterHospitales adapter;

    String[] titulo = new String[]{
            "Cruz Roja",
            "Imss",
            "Hospital OCA",
            "Doctor Hospital",
            "Hospital Universitario"


    };

    int[] imagenes = {
            R.drawable.hospitales_cruz_roja,
            R.drawable.hospitales_imss,
            R.drawable.hospital_oca,
            R.drawable.hospital_doctor_hospital,
            R.drawable.hospital_universitario,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hospitales);
        final ListView lista = (ListView) findViewById(R.id.listView6);
        adapter = new GridViewAdapterHospitales(this, titulo, imagenes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent ii = new Intent(getApplicationContext(), HospitalCroja.class);
                        startActivity(ii);
                        break;
                    case 1 :
                        Intent iii = new Intent(getApplicationContext(), HospitalImss.class);
                        startActivity(iii);
                        break;
                    case 2 :
                        Intent bii = new Intent(getApplicationContext(), HospitalOca.class);
                        startActivity(bii);
                        break;
                    case 3 :
                        Intent yii = new Intent(getApplicationContext(), HospitalDoctor.class);
                        startActivity(yii);
                        break;
                    case 4 :
                        Intent aii = new Intent(getApplicationContext(), HospitalUni.class);
                        startActivity(aii);
                        break;

                    default:
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}