package base;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int [] numerosAleatorios = new int[30];
        int cantidad=0;
        double media=0;
        int suma=0;

        for (int i = 0; i < numerosAleatorios.length ; i++) {
            //int numerosAleatorio = (int)(Math.random()*11);
            numerosAleatorios[i] = (int)(Math.random()*11);
        }

        //Recorrer la coleccion (leer = foreach)
        for (int item : numerosAleatorios) {
            suma+=item;
        }

        media = (double) suma / (double) numerosAleatorios.length;

        System.out.printf("La suma es: %d %n",suma);
        System.out.printf("La media es: %.3f %n", media);

    }
}
