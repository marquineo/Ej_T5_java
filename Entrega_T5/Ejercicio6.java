package ejercicio6;

public class Ejercicio6 {
    public static void main(String[] args) {
        

int valor = (int)Math.floor(Math.random()*100+100);
System.out.println(valor);
    if (valor % 2 == 0){
            System.out.println("Numero par");
    }else{
        System.out.println("Numero impar");
    }
    }
}