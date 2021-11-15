package base;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número por favor");

            int numero = entradaTeclado.nextInt();
            numeros[i]=numero;

        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%d : %d%n", i, numeros[i]);
        }

        System.out.println("Fin");
    }
}
