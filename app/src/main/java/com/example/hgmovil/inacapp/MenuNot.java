package com.example.hgmovil.inacapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by pablo on 04-05-2016.
 */
public class MenuNot extends AppCompatActivity
{
    private Spinner Listnota;
    String[] ramos = {"Seleccionar Asignatura","Base de datos","Matematicas 1"};
    private RelativeLayout tabNot;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_notas);

        tabNot = (RelativeLayout) findViewById(R.id.TablaNotas);


        Listnota = (Spinner) findViewById(R.id.ListaNot);
        ArrayAdapter<String> adaptador =new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,ramos);
        Listnota.setAdapter(adaptador);

        Listnota.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id)
            {
                switch (i)
                {

                    case 1:
                        tabNot.setVisibility(View.VISIBLE);


                        break;
                    case 2:
                        Toast t = Toast.makeText(getApplicationContext(),"Mostrar notas 3",Toast.LENGTH_LONG);
                        t.show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    };
}
