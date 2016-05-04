package com.example.hgmovil.inacapp;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by pablo on 27-04-2016.
 */
public class MenuPrincipal extends AppCompatActivity {
    private ImageButton BtnNot;
    private ImageButton BtnAsis;
    private ImageButton BtnHora;
    private ImageButton BtnCorr;
    private ImageButton BtnBusc;
    private ImageButton BtnAlarm;
    private ImageButton BtnREsumen;
    private ImageButton BtnPag;
    private ImageButton BtnMat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_principal);
        BtnNot = (ImageButton) findViewById(R.id.BtnNotas);

        BtnNot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menunotas = new Intent(MenuPrincipal.this, MenuNot.class);
                startActivity(menunotas);
            }
        });

        BtnAsis = (ImageButton) findViewById(R.id.BtnAsistencia);

        BtnAsis.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent menuasis = new Intent(MenuPrincipal.this, MenuAsist.class);
                startActivity(menuasis);

            }
        });

        BtnHora =(ImageButton) findViewById(R.id.BtnHorario);

        BtnHora.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent formnuevo1 = new Intent(MenuPrincipal.this, MenuHora.class);
                startActivity(formnuevo1);
            }
        });
         BtnCorr = (ImageButton) findViewById(R.id.BtnCorreo);
        BtnCorr.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent formnuevo2 = new Intent(MenuPrincipal.this, MenuCorr.class);
                startActivity(formnuevo2);
            }
        });
        BtnBusc = (ImageButton) findViewById(R.id.BtnBusquet);
        BtnBusc.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent formnuevo3 = new Intent(MenuPrincipal.this, MenuBusque.class);
                startActivity(formnuevo3);
            }
        });
        BtnAlarm = (ImageButton) findViewById(R.id.BtnAlam);
        BtnAlarm.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent formnuevo4 = new Intent(MenuPrincipal.this, MenuAlarm.class);
                startActivity(formnuevo4);
            }
        });
        BtnREsumen = (ImageButton) findViewById(R.id.BtnResAc);
        BtnREsumen.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent formnuevo5 = new Intent(MenuPrincipal.this, MenuResumen.class);
                startActivity(formnuevo5);
            }
        });
        BtnPag = (ImageButton) findViewById(R.id.BtnPag);
        BtnPag.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent formnuevo6 = new Intent(MenuPrincipal.this, MenuPagos.class);
                startActivity(formnuevo6);
            }
        });
        BtnMat = (ImageButton) findViewById(R.id.BtnMateriales);
        BtnMat.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v) {
                Intent formnuevo7 = new Intent(MenuPrincipal.this, Menu_Materiales.class);
                startActivity(formnuevo7);
            }
        });







    }
}