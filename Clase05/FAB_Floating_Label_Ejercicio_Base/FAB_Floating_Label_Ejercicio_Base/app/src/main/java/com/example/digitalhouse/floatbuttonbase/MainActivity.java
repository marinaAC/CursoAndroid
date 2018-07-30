package com.example.digitalhouse.floatbuttonbase;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText txtMensaje = (EditText) findViewById(R.id.editTxtMsn);
        final EditText txtRegalos = (EditText)findViewById(R.id.editTxtRegalos);
        final TextInputLayout inputTxtMen = findViewById(R.id.layoutMen);
        TextInputLayout inputRegalos = findViewById(R.id.layoutRegalos);
        FloatingActionButton btnEnviarMen = findViewById(R.id.btnEnviar);
        View.OnClickListener listenButton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String mensaje = txtMensaje.getText().toString();
               String regalos = txtRegalos.getText().toString();
               if(mensaje.equals("")){
                   inputTxtMen.setError("Error");
               }else{
                   inputTxtMen.setError(null);
                   Intent intent = new Intent(MainActivity.this,RegalosActivity.class);
                   Bundle bundle = new Bundle();
                   bundle.putString("mensaje",mensaje);
                   bundle.putString("regalos",regalos);
                   intent.putExtras(bundle);
                   startActivity(intent);
               }
            }
        };


        btnEnviarMen.setOnClickListener(listenButton);

    }


}
