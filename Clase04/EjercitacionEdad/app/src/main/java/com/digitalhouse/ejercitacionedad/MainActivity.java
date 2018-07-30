package com.digitalhouse.ejercitacionedad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Integer edad = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mMatchea el codigo con la vista
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(this, R.string.hello,Toast.LENGTH_SHORT);
        Button btn = (Button) findViewById(R.id.btnOne);
        Button btnPlus = (Button) findViewById(R.id.buttonPlus);
        Button btnMinor = (Button)findViewById(R.id.buttonMinor);
        Button btnNext = (Button) findViewById(R.id.buttonNext);
        final TextView txtView = (TextView) findViewById(R.id.txtEdadView);
        View.OnClickListener escuchadorPlus = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edad++;
                txtView.setText(edad.toString());
            }
        };
        btnPlus.setOnClickListener(escuchadorPlus);

        View.OnClickListener escuchadorMinor = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                edad--;
                txtView.setText(edad.toString());
            }
        };
        btnMinor.setOnClickListener(escuchadorMinor);

        View.OnClickListener escuchadorNext = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //desde donde lo estoy llamando y a que clase quiero ir
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                Bundle unBundle = new Bundle();
                unBundle.putInt("edad",edad);
                intent.putExtras(unBundle);
                startActivity(intent);
            }
        };

        btnNext.setOnClickListener(escuchadorNext);

    }



}
