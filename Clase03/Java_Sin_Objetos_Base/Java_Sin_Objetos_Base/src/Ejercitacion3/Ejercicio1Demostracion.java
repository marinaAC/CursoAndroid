package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio1Demostracion {

    ArrayList<Integer> eliminarPrimerosDosNumeros(ArrayList<Integer> unArrayDeNumeros) {

        //Retornar la lista que viene sin los dos primeros numeros.

        return null;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio1Demostracion ejercicio3 = new Ejercicio1Demostracion();

        //Test 1
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(4);
        array1.add(7);

        ejercicio3.imprimirArrayList(ejercicio3.eliminarPrimerosDosNumeros(array1));

        //Test 2
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(1);
        array2.add(103);

        ejercicio3.imprimirArrayList(ejercicio3.eliminarPrimerosDosNumeros(array2));

        //Test 3
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(-1);
        array3.add(-2);
        array3.add(14);
        array3.add(0);

        ejercicio3.imprimirArrayList(ejercicio3.eliminarPrimerosDosNumeros(array3));
    }

    public void imprimirArrayList(ArrayList<Integer> arrayList){

        for (Integer i = 0; i < arrayList.size(); i++) {
            System.out.println(i+1+": " + arrayList.get(i));
        }
        System.out.println("________________________");
    }

}
