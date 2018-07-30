package Ejercitacion3;

import java.util.ArrayList;

/**
 * Created by digitalhouse on 22/08/16.
 */
public class Ejercicio4 {

    ArrayList<Integer> eliminarPares(ArrayList<Integer> unArrayDeNumeros) {

        //Retornar la lista que viene como parámetro sin los números pares.

        return null;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio4 ejercicio4 = new Ejercicio4();

        //Test 1
        ArrayList<Integer> array1 = new ArrayList<>();
        array1.add(1);
        array1.add(2);
        array1.add(4);
        array1.add(7);

        ejercicio4.imprimirArrayList(ejercicio4.eliminarPares(array1));

        //Test 2
        ArrayList<Integer> array2 = new ArrayList<>();
        array2.add(1);
        array2.add(1);
        array2.add(103);

        ejercicio4.imprimirArrayList(ejercicio4.eliminarPares(array2));

        //Test 3
        ArrayList<Integer> array3 = new ArrayList<>();
        array3.add(-1);
        array3.add(-2);
        array3.add(14);
        array3.add(0);

        ejercicio4.imprimirArrayList(ejercicio4.eliminarPares(array3));
    }

    public void imprimirArrayList(ArrayList<Integer> arrayList){

        for (Integer i = 0; i < arrayList.size(); i++) {
            System.out.println(i+1+": " + arrayList.get(i));
        }
        System.out.println("________________________");
    }

}
