package com.example.digitalhouse.mvcjsonguiado.refactor.Controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.Producto;
import com.example.digitalhouse.mvcjsonguiado.refactor.Model.ProductoMl;

import java.util.List;

public class Adapter extends RecyclerView.Adapter {
    private List<ProductoMl> listaDeProductos;

    public Adapter(List<ProductoMl> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }


    //Notificar que los datos cambiaron
    public void setListaDeProductos(List<ProductoMl> listaDeProductos){
        this.listaDeProductos = listaDeProductos;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        // Conseguir el contexto
        Context context = parent.getContext();
        // Creo el Inflador
        LayoutInflater layoutInflater = LayoutInflater.from(context);

        // Inflo una celda
        View celda = layoutInflater.inflate(R.layout.item, parent, false);

        // Creo el ViewHolder para la celda
        MyViewHolder myViewHolder = new MyViewHolder(celda);

        // Devuelvo el ViewHolder
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            // Consigo el producto con la posicion
            ProductoMl producto = listaDeProductos.get(position);
            // Casteo el holder
            MyViewHolder myViewHolder = (MyViewHolder) holder;
            // Cargo el producto al holder
            myViewHolder.cargarProducto(producto);
    }

    @Override
    public int getItemCount() {
        return listaDeProductos.size();
    }



    private class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNombre;
        private TextView textViewDetalle;
        private TextView textViewPrecio;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewNombre = itemView.findViewById(R.id.textViewNombre);
            textViewDetalle = itemView.findViewById(R.id.textViewDescripcion);
            textViewPrecio = itemView.findViewById(R.id.textViewPrecio);
        }

        public void cargarProducto(ProductoMl producto){
            textViewNombre.setText(producto.getTitle());
            textViewDetalle.setText(producto.getPrice().toString());
           // textViewPrecio.setText(producto.getPrecio().toString());
        }
    }

}
