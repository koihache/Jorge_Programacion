package base;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        String [] cadenaString = new String[10];
        int eleccionMenu = 0;
        int letras = 0;
        int mediaLetras = 0;


        for (int i = 0; i < cadenaString.length; i++) {
            System.out.println("Introduce una palabra");
            cadenaString [i] = entradaTeclado.next();
        }

        do {
            System.out.println("1. Ver todas las palabras: (mostrarla todas las palabras del array)\n" +
                    "2. Obtener una palabra al azar: (mostrará una palabra de las que existen en el array)\n" +
                    "3. Ver número de letras: (mostrará el número de letras que hay en total entre todas las palabras)\n" +
                    "4. Ver media de letras: (mostrará el número medio de letras entre todas las palabas)\n" +
                    "5. Ver palabra con más letras\n" +
                    "6. Ver palabra con menos letras\n"+
                    "0. Salir del programa");

            System.out.println("Elija una opción");
            eleccionMenu=entradaTeclado.nextInt();

            switch (eleccionMenu){
                case 1:
                    for(int i=0;i<cadenaString.length;i++)
                    {
                        System.out.printf(cadenaString[i]+",");
                    }
                    break;
                case 2:
                    //System.out.println(cadenaString[aleatorio]);
                    break;
                case 3:
                    for (int i = 0; i < cadenaString.length; i++) {
                        letras += cadenaString[i].length();
                    }
                    System.out.println(letras);
                    break;
                case 4:

                    break;
                case 5:
                    String palabraMayor = "";

                    for (String item: cadenaString) {
                        if (item.length() >= palabraMayor.length()){
                            palabraMayor = item;
                        }
                    }
                    System.out.println("Esta es la palabra mayor: "+ palabraMayor);
                    break;
                case 6:
                    String palabraMenor = cadenaString[0];
                    for (String item: cadenaString) {
                        if (item.length() < palabraMenor.length()){
                            palabraMenor = item;
                        }
                    }
                    System.out.println("Esta es la palabra menor: "+ palabraMenor);
                    break;
                case 0:
                    System.out.println("Has salido del programa");
                    break;
            }

        }while (eleccionMenu>6 || eleccionMenu<0);

    }
}
