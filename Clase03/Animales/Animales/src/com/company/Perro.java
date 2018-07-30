package com.company;

public class Perro extends  Animal implements Paseable{

    public void hacerRuido(){
        System.out.println("wolf wolf");
    }

    @Override
    public void pasear() {
        System.out.println("paseando");
    }
}
