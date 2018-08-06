package com.example.digitalhouse.mvcjsonguiado.refactor.utils;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.TextView;

import com.example.digitalhouse.mvcjsonguiado.R;
import com.example.digitalhouse.mvcjsonguiado.refactor.Producto;

import java.util.List;

public class AdapterRecyclerProductos extends RecyclerView.Adapter {

    private List<Producto> listProducto;

    public AdapterRecyclerProductos(List<Producto> listProducto) {
        this.listProducto = listProducto;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());
        View view  = inflador.inflate(R.layout.item,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Producto prod = listProducto.get(position);
        MyViewHolder myViewHolder = (MyViewHolder)holder;
        myViewHolder.cargarView(prod);
    }

    @Override
    public int getItemCount() {
        return listProducto.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNombre;
        private TextView txtDescripcion;
        private TextView txtPrecio;

        public MyViewHolder(View itemView){
            super(itemView);
            txtNombre = itemView.findViewById(R.id.textViewNombre);
            txtDescripcion = itemView.findViewById(R.id.textViewDescripcion);
            txtPrecio = itemView.findViewById(R.id.textViewPrecio);

        }

        public void cargarView(Producto producto){
            txtNombre.setText(producto.getNombre());
            txtDescripcion.setText(producto.getDescripcion());
            txtPrecio.setText(producto.getPrecio().toString());

        }


    }
}
