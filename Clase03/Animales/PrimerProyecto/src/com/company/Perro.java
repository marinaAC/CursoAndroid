package com.company;

public class Perro extends Animal{


    public Perro(String nombre, Integer edad, Integer energia){
        super(nombre, edad, energia);

    }




    @Override
    public void HacerRuido(){
        System.out.println("wolf wolf");
    }
}
