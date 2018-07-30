package Ejercitacion2;

import java.util.ArrayList;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio2 {

    public Double promedio(ArrayList<Integer> unArrayDeEnteros){
        //Comenzar a escribir código acá
        Double prom = 0.0;
        Double sum = 0.0;
        if(!unArrayDeEnteros.isEmpty()){
            for(Integer item : unArrayDeEnteros){
                sum += item;
            }
            prom = sum / unArrayDeEnteros.size();
        }
        return prom;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){
        Ejercicio2 ejercicio2 = new Ejercicio2();
        //Test 1
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        System.out.println(ejercicio2.promedio(prueba));

        //Test 2
        ArrayList<Integer> prueba2 = new ArrayList<Integer>();
        prueba2.add(2);
        prueba2.add(4);
        prueba2.add(3);
        prueba2.add(7);
        System.out.println(ejercicio2.promedio(prueba2));

        //Test 3
        ArrayList<Integer> prueba3 = new ArrayList<Integer>();
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        prueba3.add(2);
        System.out.println(ejercicio2.promedio(prueba3));
    }
}

