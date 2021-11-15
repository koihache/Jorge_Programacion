package base;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner (System.in);

        int [] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduce un número por favor");

            int numero = entradaTeclado.nextInt();
            numeros[i]=numero;
        }



        System.out.println("Numeros ordenados del primero al último");
        for(int i=0;i<numeros.length;i++)
        {
            if (i>=9)
                System.out.println(numeros[i]+",");
            else
                System.out.println(numeros[i]);

        }
        //System.out.println(numeros[numeros.length - 1]);


        System.out.printf("%nNumeros ordenados del último al primero %n");
        for (int i = 9; i > -1; i--) {
            if (i==0)
                System.out.println(numeros[i]);
            else if (i<=numeros.length-1)
                System.out.printf("%d,",numeros[i]);

        }




    }
}
