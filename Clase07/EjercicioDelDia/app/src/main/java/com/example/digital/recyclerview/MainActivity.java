package com.example.digital.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterRecycler.ProductoClickeable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rviewTabla = findViewById(R.id.recyclerView);
        List<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos.add(new Producto("Computadora",R.drawable.gmail));
        listaProductos.add(new Producto("Lapicera",R.drawable.gmail));
        listaProductos.add(new Producto("Mouse",R.drawable.gmail));
        listaProductos.add(new Producto("Dado",R.drawable.gmail));
        listaProductos.add(new Producto("Telefono",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));
        listaProductos.add(new Producto("Silla",R.drawable.gmail));


        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
       rviewTabla.setLayoutManager(linearLayoutManager);
        AdapterRecycler adapter = new AdapterRecycler(listaProductos);

        rviewTabla.setAdapter(adapter);

    }

    @Override
    public void onClickProducto(Producto producto) {
        Toast.makeText(this,producto.getNombre(),Toast.LENGTH_LONG).show();
    }
}
