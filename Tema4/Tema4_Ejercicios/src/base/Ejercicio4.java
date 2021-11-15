package base;

public class Ejercicio4 {
    public static void main(String[] args) {
        double [] numeros = new double[20];
        double [] cuadrados = new double[20];
        double [] cubos = new double[20];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random()*101);
        }

        for (int i = 0; i < numeros.length; i++) {
            cuadrados[i] = Math.pow(numeros[i],2);
        }

        for (int i = 0; i < numeros.length; i++) {
            cubos[i] = Math.pow(numeros[i],3);
        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("%.2f \t %.2f \t %.2f %n",numeros[i],cuadrados[i],cubos[i]);
        }
    }

}
