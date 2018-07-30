package com.digitalhouse.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnviar = (Button) findViewById(R.id.btnEnviar);
        View.OnClickListener escuchadorBtn= new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = findViewById(R.id.editTxt);
                String contenido = editText.getText().toString();
                TextView txt = findViewById(R.id.txtView);
                txt.setText(contenido);
            }
        };

        btnEnviar.setOnClickListener(escuchadorBtn);
    }
}
