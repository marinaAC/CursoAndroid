package com.digitalhouse.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ColorFragment.NotificadorActivity {
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        final ColorFragment blackF =  ColorFragment.factoryColorFragment(ContextCompat.getColor(this,R.color.rojo),getResources().getString(R.string.hello_blank_fragment));
        final ColorFragment verdeF = ColorFragment.factoryColorFragment(ContextCompat.getColor(this,R.color.green),getResources().getString(R.string.hello_verde_fragment));

        Button btnUno = findViewById(R.id.btnOne);
        Button btnDos = findViewById(R.id.btnTwo);

        cambiarFragment(blackF,R.id.contenedor);

        View.OnClickListener escuchadorUno = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarFragment(blackF,R.id.contenedor);
            }
        };

        btnUno.setOnClickListener(escuchadorUno);

        View.OnClickListener escuchadorDos = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cambiarFragment(verdeF,R.id.contenedor);
            }
        };
        btnDos.setOnClickListener(escuchadorDos);
    }

    private void cambiarFragment(Fragment fg, Integer id){
        FragmentTransaction transaccion = fragmentManager.beginTransaction();
        transaccion.replace(id,fg);
        transaccion.commitNow();
    }

    public void cambiarBackground(Integer color){
        LinearLayout layout = findViewById(R.id.backgroundActivity);
        layout.setBackgroundColor(color);
    }
}
