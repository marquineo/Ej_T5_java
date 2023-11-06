package ejercicio4;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dia, mes, año, lnum, uni, dec, cent, mil;
        System.out.println("¿En que día nacieste? :");
        dia = sc.nextInt();
        System.out.println("¿En que mes naciste? :");
        mes = sc.nextInt();
        System.out.println("¿En que año naciste? :");
        año = sc.nextInt();
        lnum = dia + mes + año;
        uni = lnum % 10;
        dec = lnum % 100 /10;
        cent = lnum % 1000 /100;
        mil = lnum / 1000;
        lnum = uni + dec + cent + mil;
        uni = lnum % 10;
        dec = lnum / 10;
        lnum = uni + dec;
        System.out.println("Tu número de la suerte es :" + lnum);
    }
    
}