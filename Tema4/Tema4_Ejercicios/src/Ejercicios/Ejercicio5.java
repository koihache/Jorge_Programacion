package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        int longitud=0;

        System.out.println("Por favor introduce la longitud del primer array");
        longitud=entradaTeclado.nextInt();

        int [] numeros1 = new int[longitud];
        int [] numeros2 = new int[longitud];
        int [] numeros3 = new int[longitud];

        for (int i = 0; i < numeros1.length; i++) {
            numeros3[i] = numeros1[i] + numeros2[i];
        }
    }
}
