package com.example.digital.recyclerview;

public class Producto {

    private String nombre;
    private Integer image;

    public Producto(String nombre, Integer image) {
        this.nombre = nombre;
        this.image = image;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getImage(){
        return image;
    }


}
