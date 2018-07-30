package com.company;

public class Animal {
    private Integer energia = 100;
    private String nombre;
    private Integer edad;

    public Animal(String nombre, Integer edad, Integer energia){
        this.nombre = nombre;
        this.edad = edad;
        this.energia = energia;
    }

    public  void InformarEnergia(){
        System.out.println(energia);
    }

    public void Correr(){
        energia = energia - 10;
    }

    public void Comer(Comida unaComida){
        energia = energia + unaComida.getEnergia();
    }

    public void HacerRuido(){ }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }
}
