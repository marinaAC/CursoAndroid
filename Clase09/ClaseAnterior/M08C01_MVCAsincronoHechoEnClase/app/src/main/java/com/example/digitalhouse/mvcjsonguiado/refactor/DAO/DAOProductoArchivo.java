package com.example.digitalhouse.mvcjsonguiado.refactor.DAO;


import com.example.digitalhouse.mvcjsonguiado.refactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ProductoMl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class DAOProductoArchivo {

    public List<ProductoMl> obtenerProductosDeArchivo(){
        List<ProductoMl>productos = new ArrayList<>();
        //productos.add(new Producto("PS4","La ultima PlayStation, diversion asegurada",12000.0));
        //productos.add(new Producto("PS3","La ante-ultima PlayStation, diversion casi-asegurada",12000.0));
        //productos.add(new Producto("PS2","La segunda PlayStation, diversion notan-asegurada",12000.0));
        //productos.add(new Producto("PS1","La primer Play, diversion solo para entendidos",12000.0));
        return productos;
    }
}
