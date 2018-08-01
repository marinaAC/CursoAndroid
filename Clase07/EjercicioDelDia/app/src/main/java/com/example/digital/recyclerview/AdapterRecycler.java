package com.example.digital.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterRecycler extends RecyclerView.Adapter {

    private List<Producto> listaProduct;
    private ProductoClickeable escuchar;

    public AdapterRecycler(List<Producto> listaProduct) {
        this.listaProduct = listaProduct;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        escuchar = (ProductoClickeable) parent.getContext();
        LayoutInflater inflador = LayoutInflater.from(parent.getContext());

        View view = inflador.inflate(R.layout.celda,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Producto producto = listaProduct.get(position);
        MyViewHolder myViewHolder = (MyViewHolder)holder;
        myViewHolder.cargarView(producto);
    }

    @Override
    public int getItemCount() {
        return listaProduct.size();
    }

    public interface ProductoClickeable{

        void onClickProducto(Producto producto);

    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView txt;
        private ImageView imageview;

        public MyViewHolder(View itemView){
            super(itemView);
            txt = itemView.findViewById(R.id.txtViewCelda);
            imageview = itemView.findViewById(R.id.imgView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Se ejecuta cuando hago click en una celda
                    Producto producto = listaProduct.get(getAdapterPosition());
                    escuchar.onClickProducto(producto);
                }
            });
        }

        public void cargarView(Producto producto){
            txt.setText(producto.getNombre());
            imageview.setImageResource(producto.getImage());
        }


    }
}
