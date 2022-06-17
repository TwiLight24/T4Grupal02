package com.chevas.t4grupal02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView menuNav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        asignarReferencias();
    }

    private void asignarReferencias()
    {
        menuNav = findViewById(R.id.menuNav);
        menuNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.menu1){
                    mostrarFragmento(new Fragmento01());
                    item.setChecked(true);
                }

                if(item.getItemId() == R.id.menu2){
                    mostrarFragmento(new Fragmento02());
                    item.setChecked(true);
                }

                if(item.getItemId() == R.id.menu3){
                    Intent intent = new Intent(MainActivity.this, Activity03.class);
                    startActivity(intent);
                }

                return false;
            }
        });
    }

    private void mostrarFragmento(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.contendor, fragment)
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).commit();
    }
}