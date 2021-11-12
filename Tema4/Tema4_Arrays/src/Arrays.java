public class Arrays {
    public static void main(String[] args) {

        //Array de tipo estático

        //array de numeros para decir cuantos numeros puede tener el array//Esto guarda 10 "0"
        int [] numeros = new int[10];
        //array de numeros para decir qué numeros hay
        int [] numerosDos = {1,2,3,4,5,6,7,8,9,10};

        //array de decimales para decir cuantos decimales puede tener el array//Esto guarda dos "0.0"
        double [] decimales = new double[2];

        //array de strings para decir cuantas palabras puede tener el array//Esto guarda 5 "nulls"
        String [] palabra = new String[5];

        //array de booleans para decir cuantos valores logicos puede tener el array//Esto guarda 3 "false"
        boolean [] acierto = new boolean[3];


        //Saber numero de elementos de un array
        int longitudArray = numerosDos.length;
        System.out.println(longitudArray);

        //Obtener el valor de una posicion en un array
        System.out.println(numerosDos[0]);

        //Imprimir todos los valores de un array
        for(int i=0;i<numerosDos.length;i++)
        {
            System.out.println(numerosDos[i]);
        }

        //Modificar una posicion concreta del array
        numerosDos[7] = 88;

        //Meter en un array de 15 posiciones, 15 numeros aleatorios entre el 0 y el 50

        int[] numerosAleatorios = new int[15];
        int pares=0;
        int impares=0;

        for (int i = 0; i < numerosAleatorios.length; i++) {

            numerosAleatorios[i] = (int)(Math.random()*51);

            System.out.println("Estos son los valores del array "+numerosAleatorios[i]);

        //Indica cuantos son pares y cuantos son impares
            if (numerosAleatorios[i]%2==0){
                pares++;
            }else{
                impares++;
            }
        }
            System.out.println("Hay "+pares+" pares");
            System.out.println("Hay "+impares+" impares");

        //Crear un array con diferentes tipos de valor

        Object[]cositas = {1, "chocolate", false};
    }

}
