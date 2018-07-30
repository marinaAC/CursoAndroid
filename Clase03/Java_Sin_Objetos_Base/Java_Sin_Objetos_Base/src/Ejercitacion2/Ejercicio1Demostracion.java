package Ejercitacion2;

import java.util.ArrayList;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio1Demostracion {

    public void imprimirArrayNumeros(ArrayList<Integer> unArrayDeEnteros) {
        //Comenzar a escribir código acá
        for (int i = 0; i<unArrayDeEnteros.size(); i++){
            System.out.println(unArrayDeEnteros.get(i));
        }
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        ArrayList numeros = new ArrayList();
        numeros.add(4);
        numeros.add(7);
        numeros.add(1);
        numeros.add(9);

        Ejercicio1Demostracion ejercicio1Demostracion = new Ejercicio1Demostracion();
        //Test
        ejercicio1Demostracion.imprimirArrayNumeros(numeros);
    }
}

