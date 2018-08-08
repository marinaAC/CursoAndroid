package com.example.digitalhouse.mvcjsonguiado.refactor.DAO;

import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ContenedorProductoML;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ProductoMl;
import com.example.digitalhouse.mvcjsonguiado.refactor.Utils.ResultListener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by digitalhouse on 24/05/17.
 */

public class DAOProductoInternet {


    private Retrofit retrofit;

    public DAOProductoInternet() {
        //Formas de pegarle a la api de mercado libre
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("https://api.mercadolibre.com").addConverterFactory(GsonConverterFactory.create());
        retrofit = builder.client(httpClient.build()).build();
    }

    public void obtenerProductosDeInternet(final ResultListener<List<ProductoMl>> telController){
        final List<ProductoMl>productos = new ArrayList<>();
        ServiceProducto serviceProducto =retrofit.create(ServiceProducto.class);
        Call<ContenedorProductoML> call = serviceProducto.buscarProductosML("moto");

        call.enqueue(new Callback<ContenedorProductoML>() {
            @Override
            public void onResponse(Call<ContenedorProductoML> call, Response<ContenedorProductoML> response) {
                //se llama a este si termino bien
                ContenedorProductoML contenedorProductoML = response.body();
                List<ProductoMl> prod = contenedorProductoML.getResults();
                telController.finish(prod);
            }

            @Override
            public void onFailure(Call<ContenedorProductoML> call, Throwable t) {
                //a este si hubo problemas
            }
        });


        //deforma sincronica
        //try {
          //  Response<ContenedorProductoML> response = call.execute();
           // ContenedorProductoML contenedorProductoML = response.body();
           // productos = contenedorProductoML.getResults();
        //} catch (IOException e) {
          //  e.printStackTrace();
       // }
        // Llamo al Controller con el telefono que me pasaron
        ///telController.finish(productos);
    }



}
