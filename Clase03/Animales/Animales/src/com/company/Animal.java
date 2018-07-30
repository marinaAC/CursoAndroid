package com.company;

public class Animal {
    private Integer energia = 100;

    public Integer informaEnergia(){
        return energia;
    }

    public void correr(){
        energia = energia - 10;
    }

    public void comer(Comida unaComida){
        energia =  energia + unaComida.getEnergia();
    }

    public void hacerRuido(){
        System.out.println("ruido generico del animal");
    }
}
