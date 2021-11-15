package base;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        int [] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce numeros");
            numeros[i] = entradaTeclado.nextInt();

            if (numeros[i] % 2 == 0){
                System.out.println("Par "+numeros[i]);
            }
            else {
                System.out.println("Impar "+numeros[i]);
            }
        }

    }
}
