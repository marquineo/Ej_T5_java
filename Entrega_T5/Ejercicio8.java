package ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, invertido = 0, resto, numero2;
        System.out.println("Dame un número :");
        numero = sc.nextInt();
        numero2 = numero;
        boolean div = true;
        while (numero > 0) {
            resto = numero % 10;
            invertido = invertido * 10 + resto;
            numero = numero / 10;
        }
        System.out.println("invertido->" + invertido);
        for (int i = numero2 - 1; i > 1 && div == true; i--) {
            if (numero2 % i == 0) {
                System.out.println("No es un numero Omirp");
                div = false;
            }
        }
        for (int i = invertido - 1; i > 1 && div == true; i--) {
            if (invertido % i == 0) {
                System.out.println("No es un numero Omirp");
                div = false;

            }
        }
        if (div == true) {
            System.out.println("Es un numero Omirp");
        }
    }
}
