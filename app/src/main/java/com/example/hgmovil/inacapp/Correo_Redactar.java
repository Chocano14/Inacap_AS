package com.example.hgmovil.inacapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by Mati on 18-05-2016.
 */
public class Correo_Redactar extends AppCompatActivity
{
    private Spinner SelecProfes;
    String[] Profes = {"Seleccionar profesor","Barria Flores Marcelo Orlando","González Escobar Oscar Hernán","González Oyarzún Claudio Roberto",
            "Moya Bascur Cristhian Andrés","Quezada Contreras Armin Wilson","Soto Alarcon Cesar Bernardo"};
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correo_redactar);
        SelecProfes = (Spinner) findViewById(R.id.spnSpinner);
        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,Profes);
        SelecProfes.setAdapter(adaptador);
    };
}