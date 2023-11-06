package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        int num = 2;
        System.out.println("Los 50 primeros número pares son:");
        for (int i = 1; i <= 50; i++) {
            System.out.print(" " + num + ",");
            num = num + 2;
        }

    }

}