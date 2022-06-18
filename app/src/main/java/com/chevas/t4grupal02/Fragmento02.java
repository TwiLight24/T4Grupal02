package com.chevas.t4grupal02;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragmento02#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento02 extends Fragment {
    EditText txtNumero1, txtNumero2;
    TextView txtResultado;
    Button btnCalcular;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragmento02() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmento02.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento02 newInstance(String param1, String param2) {
        Fragmento02 fragment = new Fragmento02();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmento02, container, false);

        txtResultado = v.findViewById(R.id.lblResult2);

        txtNumero1 = v.findViewById(R.id.txtNum1_1);
        txtNumero2 = v.findViewById(R.id.txtNum2_2);
        btnCalcular = v.findViewById(R.id.btnMultiplicar);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Numero1 = Integer.parseInt(txtNumero1.getText().toString());
                double Numero2 = Integer.parseInt(txtNumero2.getText().toString());
                double monto = (Numero1 * Numero2);
                Toast.makeText(getContext(), "El resultado es: "+monto, Toast.LENGTH_SHORT).show();
                txtResultado.setText("El resultado es: "+monto);
            }
        });

        return v;
    }
}