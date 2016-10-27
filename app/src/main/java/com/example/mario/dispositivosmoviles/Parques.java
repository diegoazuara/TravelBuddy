package com.example.mario.dispositivosmoviles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Parques extends AppCompatActivity {
    GridViewAdapterParques adapter;

    String[] titulo = new String[]{
            "Parque Fundidora",
            "Parque Chipinque",
            "Bioparque Estrella",
            "Parque Natural La Estanzuela",
            "Parque Zoologico La Pastora",
            "Parque Niños Heroes",
            "Parque España",
            "Parqe Ecoturistico Cola de Caballo",
            "Parque La Huasteca",
    };

    int[] imagenes = {
            R.drawable.parque_fundidora,
            R.drawable.parque_chipinque,
            R.drawable.parque_bioparque,
            R.drawable.parque_estanzuela,
            R.drawable.parque_lapastora,
            R.drawable.parque_ninos_heroes,
            R.drawable.parque_espana,
            R.drawable.parque_cola_caballo,
            R.drawable.parque_huasteca,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parques);
        final ListView lista = (ListView) findViewById(R.id.listView7);
        adapter = new GridViewAdapterParques(this, titulo, imagenes);
        lista.setAdapter(adapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int posicion, long l) {
                //Toast.makeText(getApplicationContext(), "posicion " + (i + 1) + personas[i], Toast.LENGTH_SHORT).show();
                switch (posicion) {
                    case 0 :
                        Intent ii = new Intent(getApplicationContext(), Parques.class);
                        startActivity(ii);
                        break;
                    case 1 :
                        Intent iii = new Intent(getApplicationContext(), Parques.class);
                        startActivity(iii);
                        break;
                    case 2 :
                        Intent xii = new Intent(getApplicationContext(), Parques.class);
                        startActivity(xii);
                        break;
                    case 3 :
                        Intent lii = new Intent(getApplicationContext(), Parques.class);
                        startActivity(lii);
                        break;
                    case 4 :
                        Intent aii = new Intent(getApplicationContext(), Parques.class);
                        startActivity(aii);
                        break;
                    case 5 :
                        Intent ai = new Intent(getApplicationContext(), Parques.class);
                        startActivity(ai);
                        break;
                    case 6 :
                        Intent rxx = new Intent(getApplicationContext(), Parques.class);
                        startActivity(rxx);
                        break;
                    case 7 :
                        Intent jxx = new Intent(getApplicationContext(), Parques.class);
                        startActivity(jxx);
                        break;
                    case 8 :
                        Intent jx = new Intent(getApplicationContext(), Parques.class);
                        startActivity(jx);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}