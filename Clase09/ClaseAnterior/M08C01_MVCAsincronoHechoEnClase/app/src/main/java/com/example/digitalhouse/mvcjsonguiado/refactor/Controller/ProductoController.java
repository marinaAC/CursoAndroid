package com.example.digitalhouse.mvcjsonguiado.refactor.Controller;


import com.example.digitalhouse.mvcjsonguiado.refactor.DAO.DAOProductoArchivo;
import com.example.digitalhouse.mvcjsonguiado.refactor.DAO.DAOProductoInternet;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ProductoMl;
import com.example.digitalhouse.mvcjsonguiado.refactor.Utils.ResultListener;

import java.util.List;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class ProductoController {

    public void obtenerProductos(final ResultListener<List<ProductoMl>> telDeLaVista) {
        List<ProductoMl> productos = null;
        //TODO: Tengo que chequear si hay internet
        //TODO: Si llega a haber internet tengo que obtenerlos de internet
        //TODO: Si no los tengo tengo que obtenerlos de la base de datos
        if (hayInternet()){

            // Creo mi Telefono
            ResultListener<List<ProductoMl>> telController = new ResultListener<List<ProductoMl>>() {
                @Override
                public void finish(List<ProductoMl> resultado) {
                    // Cuando el Dao termmina y me devuelve los productos
                    // LLamo a la vista y le paso sus productos
                    telDeLaVista.finish(resultado);
                }
            };

            // Creo el Dao de internet
            DAOProductoInternet daoProductoInternet = new DAOProductoInternet();
            // Le pido productos y le paso mi telefono
            daoProductoInternet.obtenerProductosDeInternet(telController);

        } else {
            // Creo el Dao de Archivo
            DAOProductoArchivo daoProductoArchivo = new DAOProductoArchivo();

            // Le pido productos al Dao de Archivo que es sincrono
            productos = daoProductoArchivo.obtenerProductosDeArchivo();

            // Una vez que tengo los productos. Llamo a la vista con su telefono
            telDeLaVista.finish(productos);
        }

    }

    public Boolean hayInternet(){
        return true;
    }


}
