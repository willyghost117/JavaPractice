import java.util.*;
public class ContitionIf {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa tu edad : ");
        int age = scanner.nextInt();
        if ( age == 18){
            System.out.println("Eres mayor de dad");
        }else if (age < 18) {
            System.out.println("Eres menor de edad");
        }else if (age < 40){
            System.out.println("Eres un joven adulto");
        }else if (age < 65){
            System.out.println("Eres una persona madura");
        }else if (age > 65){
            System.out.println("Eres una persona de la tercera edad");
        }
    }
}
