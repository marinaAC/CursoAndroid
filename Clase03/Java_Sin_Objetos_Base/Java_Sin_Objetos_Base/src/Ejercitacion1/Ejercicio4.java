package Ejercitacion1;

/**
 * Created by andres on 31/03/16.
 */
public class Ejercicio4 {

    public Boolean esImparMayorADiez(Integer unNumero){
        //Comenzar a escribir código acá
        Integer retorno = unNumero%2;
        if(unNumero>10 && retorno!=0){
            return true;
        }
        return false;
    }

    //No cambiar nada de aca hacia abajo
    public static void main(String[] args){

        Ejercicio4 ejercicio4 = new Ejercicio4();
        //Test 1
        System.out.println(ejercicio4.esImparMayorADiez(1));
        //Test 2
        System.out.println(ejercicio4.esImparMayorADiez(13));
        //Test 3
        System.out.println(ejercicio4.esImparMayorADiez(22));
    }
}

