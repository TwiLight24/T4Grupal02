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
                double Numero1 = Double.parseDouble(txtNumero1.getText().toString());
                double Numero2 = Double.parseDouble(txtNumero2.getText().toString());
                double monto = Math.round((Numero1 / Numero2)*100.0)/100.0;
                Toast.makeText(Activity03.this, "El resultado de la división es: "+monto, Toast.LENGTH_SHORT).show();
                txtResultado.setText("El resultado de la división es: "+monto);
            }
        });
    }
}