package base;

public class Ejercicio6 {
    public static void main(String[] args) {

        int [] numerosAleatorios = new int[20];
        int cantidad = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random()*31);

            switch (numerosAleatorios [i]){
                case 6:
                    numerosAleatorios[i]=8;
                    cantidad++;
                    break;
                case 7:
                    numerosAleatorios[i]=15;
                    cantidad++;
                    break;
                case 20:
                    numerosAleatorios[i]=10;
                    cantidad++;
                    break;
            }
        }
        System.out.println("Se han producido "+ cantidad+" cambios");

    }
}
