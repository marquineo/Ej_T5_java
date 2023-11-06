package ejercicio5;

import java.util.Scanner;


public class Ejercicio5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tabla = 1;
        System.out.println("¿Qué tabla quieres mostrar por pantalla? :");
        tabla = sc.nextInt();
        System.out.println("Tabla del " + tabla + "\n"
                + "****** \n"
                + "1 x " + tabla + " = " + tabla*1 + "\n"
                + "2 x " + tabla +" = " + tabla*2 + "\n"
                + "3 x " + tabla +" = " + tabla*3 +"\n"
                + "4 x " + tabla +" = " + tabla*4 +"\n"
                + "5 x " + tabla +" = " + tabla*5 +"\n"
                + "6 x " + tabla +" = " + tabla*6 +"\n"
                + "7 x " + tabla +" = " + tabla*7 +"\n"
                + "8 x " + tabla +" = " + tabla*8 +"\n"
                + "9 x " + tabla +" = " + tabla*9 +"\n"
                + "10 x " + tabla +" = " + tabla*10);
        
    }
    
}
