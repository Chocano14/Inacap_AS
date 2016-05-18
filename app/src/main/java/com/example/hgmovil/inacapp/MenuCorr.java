package com.example.hgmovil.inacapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by pablo on 04-05-2016.
 */
public class MenuCorr extends AppCompatActivity
{
    private ImageButton BtnRecib;
    private ImageButton BtnEnvi;
    private ImageButton BtnRedac;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_corr);

        BtnRecib = (ImageButton) findViewById(R.id.btnRecibir);

        BtnRecib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent recicorr = new Intent(MenuCorr.this, Correo_Recibido.class);
                startActivity(recicorr);
            }
        });


        BtnEnvi = (ImageButton) findViewById(R.id.btnEnvi);

        BtnEnvi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent envicorr = new Intent(MenuCorr.this, Correo_Enviado.class);
                startActivity(envicorr);
            }
        });


        BtnRedac = (ImageButton) findViewById(R.id.btnRedac);

        BtnRedac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redaccorr = new Intent(MenuCorr.this, Correo_Redactar.class);
                startActivity(redaccorr);
            }
        });


    };
}
