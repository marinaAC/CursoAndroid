package com.example.digitalhouse.mvcjsonguiado.refactor;


import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class ProductoController {

    public List<Producto> obtenerProductos() {
        List<Producto> productos = null;
        //TODO: Tengo que chequear si hay internet
        //TODO: Si llega a haber internet tengo que obtenerlos de internet
        //TODO: Si no los tengo tengo que obtenerlos de la base de datos
        if(hayInternet()){
            DAOProductoInternet daoInternet = new DAOProductoInternet();
            productos = daoInternet.obtenerProductosDeInternet();
        }else{
            DAOProductoArchivo daoArchivo = new DAOProductoArchivo();
            productos = daoArchivo.obtenerProductosDeArchivo();
        }
        return productos;
    }

    public Boolean hayInternet(){
        return true;
    }



}
