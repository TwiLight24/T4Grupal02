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
 * Use the {@link Fragmento01#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragmento01 extends Fragment {
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

    public Fragmento01() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragmento01.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragmento01 newInstance(String param1, String param2) {
        Fragmento01 fragment = new Fragmento01();
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

        View v = inflater.inflate(R.layout.fragment_fragmento01, container, false);

        txtResultado = v.findViewById(R.id.lblResult);

        txtNumero1 = v.findViewById(R.id.txtNum1);
        txtNumero2 = v.findViewById(R.id.txtNum2);
        btnCalcular = v.findViewById(R.id.btnSumar);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int Numero1 = Integer.parseInt(txtNumero1.getText().toString());
                int Numero2 = Integer.parseInt(txtNumero2.getText().toString());
                int monto = (Numero1 + Numero2);
                Toast.makeText(getContext(), "El resultado es: "+monto, Toast.LENGTH_SHORT).show();
                txtResultado.setText("El resultado es: "+monto);
            }
        });

        return v;
    }

}