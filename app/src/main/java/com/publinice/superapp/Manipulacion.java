package com.publinice.superapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Manipulacion extends AppCompatActivity {
    EditText edtnombre;
    EditText edtmonto;
    TextView txtresultado;
    Button btnejecutar;
    int centinela = 0;
    Button btnvisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipulacion);
        btnvisible=findViewById(R.id.visibilidad);

        edtnombre = findViewById(R.id.edtnombre);
        edtmonto = findViewById(R.id.edtmonto);
        txtresultado = findViewById(R.id.txtResultado);
        btnejecutar = findViewById(R.id.btncambiar);
        btnejecutar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double cambio;
                cambio = Double.parseDouble(edtmonto.getText().toString()) * 3.3;
                txtresultado.setText(edtnombre.getText() + " el monto de " + edtmonto.getText() +
                        " dolares equivale a " + cambio.toString() + " Nuevos Soles");
            }
        });
    }

    public void ocultar(View view) {
        if (centinela==0){
            btnejecutar.setVisibility(View.GONE);
            centinela=1;
            btnvisible.setText("APARECER");
        }else{
            btnejecutar.setVisibility(View.VISIBLE);
            centinela=0;
            btnvisible.setText("OCULTAR");
        }

    }
}

