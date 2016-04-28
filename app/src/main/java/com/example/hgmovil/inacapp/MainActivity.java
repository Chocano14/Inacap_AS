package com.example.hgmovil.inacapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = (Button) findViewById(R.id.btnIniciar);
        final EditText Contraseña = (EditText) findViewById(R.id.txtContra);
        final EditText Rut = (EditText)findViewById(R.id.txtRut);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String rutUsuario = Rut.getText().toString();
                String ConUsuario = Contraseña.getText().toString();
                if (rutUsuario.equals("18578099-6")&& ConUsuario.equals("1234567"))
                {
                    Intent nuevoform = new Intent(MainActivity.this,MenuPrincipal.class);
                    startActivity(nuevoform);
                }
                else
                {

                    Toast.makeText(getApplicationContext(),"Usuario y contraseña no existen", Toast.LENGTH_SHORT).show();

                }

            }
        });


    }
}
