package com.example.hgmovil.inacapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

/**
 * Created by pablo on 04-05-2016.
 */
public class MenuBusque extends AppCompatActivity
{
    private Spinner Busacarsala;
    String[] Salas = {"Seleccionar sala","A3","B14","B11"};
    private ImageView imagen;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_busque);
        Busacarsala = (Spinner) findViewById(R.id.BuscarSala);
        imagen =(ImageView) findViewById(R.id.MapaSala); 
        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Salas);
        Busacarsala.setAdapter(adaptador);
        Busacarsala.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int t, long id)
            {
                switch (t)
                {
                    case 1:
                        imagen.setVisibility(View.VISIBLE);

                        break;
                    case 2:

                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    };
}

