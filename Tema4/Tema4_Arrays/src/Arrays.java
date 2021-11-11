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

        for(int i=0;i<=numerosDos.length-1;i++)
        {
            System.out.println(numerosDos[i]);
        }
    }
}
