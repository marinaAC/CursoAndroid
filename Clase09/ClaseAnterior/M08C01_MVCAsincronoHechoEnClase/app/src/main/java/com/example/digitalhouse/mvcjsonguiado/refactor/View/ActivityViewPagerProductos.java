package com.example.digitalhouse.mvcjsonguiado.refactor.View;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ProductoMl;

import java.util.List;

public class ActivityViewPagerProductos extends AppCompatActivity {

    private List<ProductoMl> productos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_deportivos_v4);

        cargarProductos();
    }

    public void cargarProductos(){
        //TODO: Aca le pido al controlador que me pase los productos y melos guardo
    }

}



