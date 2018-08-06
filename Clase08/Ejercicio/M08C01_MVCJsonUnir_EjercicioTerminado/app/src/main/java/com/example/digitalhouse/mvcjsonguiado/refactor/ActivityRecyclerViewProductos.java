package com.example.digitalhouse.mvcjsonguiado.refactor;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.refactor.utils.AdapterRecyclerProductos;

import java.util.List;

public class ActivityRecyclerViewProductos extends AppCompatActivity {
    private List<Producto> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_v4);
        RecyclerView recyclerView = findViewById(R.id.recyclerId);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        cargarProductos();
        AdapterRecyclerProductos adapt = new AdapterRecyclerProductos(productos);
        recyclerView.setAdapter(adapt);
    }

    public void cargarProductos(){
        //TODO: Aca le pido al controlador que me pase los productos y melos guardo
        ProductoController pc = new ProductoController();
        productos = pc.obtenerProductos();
    }
}


