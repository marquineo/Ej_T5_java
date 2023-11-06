package ejercicio1;


public class Ejercicio1 {

    
    public static void main(String[] args) {
    int a = 2;
    int b = 3;
    int c = 1;
    if (a != b && a != c && b != c){
    if (a>b && a>c){
        System.out.println(a+" de la variable a tiene el mayor valor ");
        if (b>c){
            System.out.println(b+" de la variable b tiene el valor medio");
            System.out.println(c+" de la variable c tiene el menor valor");
        }else{
        System.out.println(c+" de la variable c tiene el valor medio");
        System.out.println(b+" de la variable b tiene el menor valor");
        }
    
    }
    if (b>a && b>c){
        System.out.println(b+" de la variable b tiene el mayor valor ");
        if (a>c){
            System.out.println(a+" de la variable a tiene el valor medio");
            System.out.println(c+" de la variable c tiene el menor valor");
        }else{
        System.out.println(c+" de la variable c tiene el valor medio");
        System.out.println(a+" de la variable a tiene el menor valor");
        }
    
    }
    if (c>b && c>b){
        System.out.println(c+" de la variable c tiene el mayor valor ");
        if (a>b){
            System.out.println(a+" de la variable a tiene el valor medio");
            System.out.println(b+" de la variable b tiene el menor valor");
        }else{
        System.out.println(b+" de la variable b tiene el valor medio");
        System.out.println(a+" de la variable a tiene el menor valor");
        }
    
    }
    }else{
        System.out.println("No puedo ordenar de mayor a menor si los números son iguales");
    }
    }
    
}
