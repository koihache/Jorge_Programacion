package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner (System.in);

        int longitudArray=0;

        System.out.println("Por favor introduce la longitud del array");
        longitudArray=entradaTeclado.nextInt();

        int [] numeros = new int[longitudArray];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca un valor");
            numeros[i]=entradaTeclado.nextInt();
        }
        System.out.println("Nada mas introducirse");
        for (int item:numeros) {
            System.out.println(item);
        }

        int ultimo = numeros[numeros.length-1];
        int primero = numeros[0];

        //Para que salga (2,3,4,5,1)
        for (int i = 0; i < numeros.length-1; i++) {
            numeros[i]=numeros[i+1];
        }
        numeros[numeros.length-1]= primero;
        System.out.println("Lo que ha pasado");
        for (int item:numeros) {
            System.out.println(item);
        }

        /* Para que salga (5,1,2,3,4)

        for (int i = numeros.length-1; i > 0; i--) {
            numeros[i] = numeros[i-1];
        }
        numeros[0]=ultimo;
        System.out.println("Lo que ha pasado");
        for (int item:numeros) {
            System.out.println(item);
        }
        */

    }
}
