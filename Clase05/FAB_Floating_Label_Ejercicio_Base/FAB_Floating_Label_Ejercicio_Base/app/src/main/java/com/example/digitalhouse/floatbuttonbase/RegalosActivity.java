package com.example.digitalhouse.floatbuttonbase;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RegalosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regalos);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String mensaje = bundle.getString("mensaje");
        String regalos = bundle.getString("regalos");
        TextView txtMen =findViewById(R.id.txtMensaje2);
        TextView txtReg = findViewById(R.id.txtRegalos);
        txtMen.setText(mensaje);
        if(regalos.equals("")){
            txtReg.setText("No te dio ningun regalo el rata");
        }else{
            txtReg.setText(regalos);
        }

    }
}
