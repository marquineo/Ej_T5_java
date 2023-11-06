package ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        for (int i = 8; i != 0; i = i - 2) {
            for (int b = 0; b != i; b = b + 2) {
                System.out.print(" ");
            }
            for (int a = 8; a >= i; a--) {
                System.out.print("*");

            }
            System.out.println("");
        }
        for (int i = 0; i != 10; i = i + 2) {
            for (int b = 0; b != i; b = b + 2) {
                System.out.print(" ");
            }
            for (int a = 8; a >= i; a--) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }

}
