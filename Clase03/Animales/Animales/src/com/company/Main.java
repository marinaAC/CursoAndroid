package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Crear un objeto de la clase animal
        Animal unAnimalRavioso = new Animal();
        System.out.println(unAnimalRavioso.informaEnergia());

        //Al objeto le digo que corra
        unAnimalRavioso.correr();

        //Imprimo la energia
        System.out.println(unAnimalRavioso.informaEnergia());

        Comida unPaty = new Comida();
        unPaty.setEnergia(120);
        System.out.println(unPaty.getEnergia());

        System.out.println("Energia antes de comer paty " + unAnimalRavioso.informaEnergia());
        unAnimalRavioso.comer(unPaty);

        System.out.println("Energia despues de comer paty " + unAnimalRavioso.informaEnergia());

        Perro perroCobarde = new Perro();
        perroCobarde.hacerRuido();

        Gato gatoCobarde = new Gato();
        ArrayList<Animal>animales = new ArrayList<>();

        animales.add(perroCobarde);
        animales.add(gatoCobarde);

        System.out.println("hacer ruido animales");
        for (Animal unAnimal:animales) {
                unAnimal.hacerRuido();
        }



    }
}
