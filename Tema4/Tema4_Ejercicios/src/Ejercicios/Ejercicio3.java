package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);
        int numeroIntro=0;
        double media=0,suma=0;
        int [] numeros = new int [5];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor introduce numero");
            numeros[i]= entradaTeclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i]*2;
        }

        for (int item:numeros) {
            suma+=item;

        }

        System.out.println("la suma de los numeros es: "+suma);
        System.out.println("La media de los numeros es: "+ (double) suma/(double)numeros.length);
    }
}
