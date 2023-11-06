package ejercicio7;

import java.util.Random;

public class Ejercicio7 {

    public static void main(String[] args) {
        int unidades, decenas, centenas, mil;
        int valor;

        Random rnd = new Random();
        valor = rnd.nextInt(4000);
        System.out.println(valor);
        mil = valor / 1000;
        centenas = valor % 1000 / 100;
        decenas = valor % 100 / 10;
        unidades = valor % 10;
        System.out.println(" " + mil + " " + centenas + " " + decenas + " " + " " + unidades);
        //UNIDADES DE MILLAR
        switch (mil) {
            case 1:
                System.out.print("M");
                break;
            case 2:
                System.out.print("MM");
                break;
            case 3:
                System.out.print("MMM");
                break;
        }
        // CENTENAS
        if (centenas == 9) {
            System.out.print("CM");
        } else if (centenas >= 5) {
            System.out.print("D");
            for (int i = 6; i <= centenas; i++) {
                System.out.print("C");
            }
        } else if (centenas < 4) {

            for (int i = 1; i <= centenas; i++) {
                System.out.print("C");
            }
        } else {
            System.out.print("CD");
        }
        //DECENAS
                if (decenas == 9) {
            System.out.print("XC");
        } else if (decenas >= 5) {
            System.out.print("L");
            for (int i = 6; i <= decenas; i++) {
                System.out.print("X");
            }
        } else if (decenas < 4) {

            for (int i = 1; i <= decenas; i++) {
                System.out.print("X");
            }
        } else {
            System.out.print("XL");
        }
                //UNIDADES
                            if (unidades == 9) {
            System.out.print("IX");
        } else if (unidades >= 5) {
            System.out.print("V");
            for (int i = 6; i <= unidades; i++) {
                System.out.print("I");
            }
        } else if (unidades < 4) {

            for (int i = 1; i <= unidades; i++) {
                System.out.print("I");
            }
        } else {
            System.out.print("IV");
        }
   }
}
