package com.example.hgmovil.inacapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.Calendar;

/**
 * Created by pablo on 04-05-2016.
 */
public class MenuHora extends AppCompatActivity
{
    private int año;
    private int dia;
    private int mes;
    private EditText campofecha;
    private Button btnAceptar;
    private static final int TIPO_DIALOGO = 0;
    private static DatePickerDialog.OnDateSetListener SelectFecha;
    private RelativeLayout mhor;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_hora);
        mhor =(RelativeLayout)findViewById(R.id.mHorario);
        campofecha=(EditText)findViewById(R.id.editFecha);
        btnAceptar= (Button)findViewById(R.id.btnFecha);
        Calendar calendario = Calendar.getInstance();
        año = calendario.get(Calendar.YEAR);
        mes = calendario.get(Calendar.MONTH);
        dia = calendario.get(Calendar.DAY_OF_MONTH);
        mostraFecha();
        SelectFecha = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                año = year;
                dia = dayOfMonth;
                mes = monthOfYear;
                mostraFecha();
            }
        };

    };

    @Override
    protected Dialog onCreateDialog(int id)
    {
        switch (id)
        {
            case 0:
                return new DatePickerDialog(this,SelectFecha,año,mes,dia);
        }

        return null;

    }


    public void mostrarCalendario(View view)
    {
        showDialog(TIPO_DIALOGO);


    }



    public void mostraFecha()
    {
        campofecha.setText(dia+"/"+(mes+1)+"/"+año);
        if(dia==19)
        {
            mhor.setVisibility(View.VISIBLE);
        }


    }
}
