package com.example.hgmovil.inacapp;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;
import android.app.TimePickerDialog;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * Created by pablo on 04-05-2016.
 */
public class MenuAlarm extends AppCompatActivity
{
    private EditText textoAlar;
    private EditText fechaAlar;
    private EditText horaAlarm;
    private Button   btnAlarma;
    private Button btnCRear;
    private int año;
    private int dia;
    private int mes;
    private int mHour, mMinute;
    private Button btnHoras;
    private static final int TIPO_DIALOGO = 0;
    private static DatePickerDialog.OnDateSetListener SelectFecha;


    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_alarm);
        textoAlar= (EditText) findViewById(R.id.txtTxAlar);
        fechaAlar= (EditText) findViewById(R.id.txtFechaAlar);
        horaAlarm= (EditText) findViewById(R.id.txtHoraAlar);
        btnAlarma= (Button) findViewById(R.id.btnCAlarma);
        btnHoras= (Button) findViewById(R.id.btnHora);
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

    public void onClickHora(View v)
    {
        final Calendar c = Calendar.getInstance();
        mHour = c.get(Calendar.HOUR_OF_DAY);
        mMinute = c.get(Calendar.MINUTE);
        if (v == btnHoras)
        {


            TimePickerDialog tpd = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {

                        @Override
                        public void onTimeSet(TimePicker view, int hourOfDay,
                                              int minute)
                        {

                            horaAlarm.setText(hourOfDay + ":" + minute);
                        }
                    }, mHour, mMinute, false);
            tpd.show();
        }
    }
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

        fechaAlar.setText(dia+"/"+(mes+1)+"/"+año);


    }


        public void onClickAcptar(View v)
        {
            String textoAlarma = textoAlar.getText().toString();
            if(btnAlarma==v)
            {
                final AlertDialog.Builder asitencias = new AlertDialog.Builder(MenuAlarm.this);
                asitencias.setTitle("Alarma Creada");
                asitencias.setMessage("Asunto:"+textoAlarma + "\n" +
                        "Fecha de Alarma:"+dia+"/"+(mes+1)+"/"+año+ "\n" +
                        "Hora de Alarma:"+mHour+":"+ mMinute);
                asitencias.setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                    }
                });
                asitencias.show();
            }
        }
}
