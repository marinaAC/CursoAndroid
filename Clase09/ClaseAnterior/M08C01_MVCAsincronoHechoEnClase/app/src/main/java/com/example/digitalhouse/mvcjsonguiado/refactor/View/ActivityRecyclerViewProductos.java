package com.example.digitalhouse.mvcjsonguiado.refactor.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.refactor.Controller.Adapter;
import com.example.digitalhouse.mvcjsonguiado.refactor.Controller.ProductoController;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ProductoMl;
import com.example.digitalhouse.mvcjsonguiado.refactor.Utils.ResultListener;

import java.util.ArrayList;
import java.util.List;

public class ActivityRecyclerViewProductos extends AppCompatActivity {
    private List<ProductoMl> productos = new ArrayList<>();
    private Adapter adapter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_v4);

        adapter = new Adapter(productos);
        cargarProductos();

        //Toast.makeText(this,productos.toString(),Toast.LENGTH_SHORT).show();


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        // Creo el Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        // Seteo el Manager
        recyclerView.setLayoutManager(linearLayoutManager);
        // Mejoro la performance
        recyclerView.setHasFixedSize(true);
        // Creo el Adapter

        // Seteo el Adapter al Recycle
        recyclerView.setAdapter(adapter);


    }

    public void cargarProductos(){
        //TODO: Aca le pido al controlador que me pase los productos y melos guardo
        ProductoController productoController = new ProductoController();


        // Creo mi telefono
        ResultListener<List<ProductoMl>> telVista = new ResultListener<List<ProductoMl>>() {

            @Override
            public void finish(List<ProductoMl> resultado) {
                // LLEGARON LOS DATOS. REFRESCAR
                //meter la interfaz con finish
                adapter.setListaDeProductos(resultado);
            }
        };

        // Pido los datos al Controller y le paso mi telefono
        productoController.obtenerProductos(telVista);
    }
}


