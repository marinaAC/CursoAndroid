package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Animal unAnimal = new Animal();
        unAnimal.InformarEnergia();
        unAnimal.Correr();
        unAnimal.InformarEnergia();

        Animal otroAnimal = new Animal();
        otroAnimal.Correr();
        otroAnimal.Correr();
        otroAnimal.InformarEnergia();

        Comida comidaUno = new Comida();
        comidaUno.setEnergia(20);
        otroAnimal.Comer(comidaUno);

        Perro unPerro = new Perro( "Negrito",12);
        unPerro.HacerRuido();

      ArrayList<Animal> listAnimales = new ArrayList<>();

      listAnimales.add(unPerro);

      Gato michifus = new Gato();

      listAnimales.add(michifus);

      Animal animalDos = new Animal();
        animalDos = listAnimales.get(1);
        animalDos.HacerRuido();
    }
}
