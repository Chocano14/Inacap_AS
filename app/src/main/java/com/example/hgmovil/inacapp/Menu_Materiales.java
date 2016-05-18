package com.example.hgmovil.inacapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by pablo on 04-05-2016.
 */
public class Menu_Materiales extends AppCompatActivity
{
    private Spinner SelecMate;
    String[] Mates = {"Seleccionar Asignatura","Comportamiento Organizacional y Recursos...","Tecnologías de Información y Comunicación I",
            "Taller de Proyecto de Software"};
    private RelativeLayout u;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_materiales);

        SelecMate = (Spinner) findViewById(R.id.spnMate);
        u = (RelativeLayout) findViewById(R.id.RelMat);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Mates);
        SelecMate.setAdapter(adaptador);
        SelecMate.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id)
            {
                switch (i)
                {

                    case 1:



                        break;
                    case 2:

                    u.setVisibility(View.VISIBLE);

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    };
}