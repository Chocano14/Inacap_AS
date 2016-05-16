package com.example.hgmovil.inacapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by pablo on 04-05-2016.
 */
public class MenuAsist extends AppCompatActivity
{
    private Button ramo1;
    private Button ramo2;
    private Button ramo3;
    private Button ramo4;
    private Button ramo5;
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_asistencia);

        ramo1 = (Button) findViewById(R.id.btnramos1);
        ramo2 = (Button) findViewById(R.id.btnramos2);
        ramo3 = (Button) findViewById(R.id.btnramos3);
        ramo4 = (Button) findViewById(R.id.btnramos4);
        ramo5 = (Button) findViewById(R.id.btnramos5);

        ramo1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                final AlertDialog.Builder asitencias = new AlertDialog.Builder(MenuAsist.this);
                asitencias.setTitle("Asistencia Matematicas 1");
                asitencias.setMessage("Total Horas Asignatura: 70 Horas" +"\n"+
                        "Total Horas Realizadas: 40 Horas"+"\n" +
                        "Total Horas Asistidas: 39 Horas"+"\n" +
                        "Porcentaje de asistencia : 51,43%");
                asitencias.setPositiveButton("Aceptar", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                    }
                });

                asitencias.show();

            }
        });





    };
    public void onAlertDialog (View view)
    {


    }

}
