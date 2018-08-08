package com.example.digitalhouse.mvcjsonguiado.refactor.DAO;

import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ContenedorProductoML;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ServiceProducto {

    //ESTO ES COMO LO VA A PEDIR RETROFIT
    @GET("sites/MLA/search")
    public Call<ContenedorProductoML> buscarProductosML(@Query("q") String producto);
}
