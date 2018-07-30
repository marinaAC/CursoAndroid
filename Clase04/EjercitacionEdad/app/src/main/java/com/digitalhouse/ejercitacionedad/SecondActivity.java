package com.digitalhouse.ejercitacionedad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView txtViewSecond = (TextView) findViewById(R.id.txtViewSecond);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        Integer edad = bundle.getInt("edad");
        txtViewSecond.setText(edad.toString());
    }
}
