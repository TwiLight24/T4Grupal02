package com.chevas.t4grupal02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity03 extends AppCompatActivity {
    EditText txtNumero1, txtNumero2;
    TextView txtResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_03);
        asignarReferencias();
    }

    private void asignarReferencias(){
        txtResultado = findViewById(R.id.lblResult3);

        txtNumero1 = findViewById(R.id.txtNum1_3);
        txtNumero2 = findViewById(R.id.txtNum2_3);
        btnCalcular = findViewById(R.id.btnDividir);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Numero1 = Integer.parseInt(txtNumero1.getText().toString());
                double Numero2 = Integer.parseInt(txtNumero2.getText().toString());
                double monto = (Numero1 / Numero2);
                Toast.makeText(Activity03.this, "El resultado es: "+monto, Toast.LENGTH_SHORT).show();
                txtResultado.setText("El resultado es: "+monto);
            }
        });
    }
}