import java.util.Scanner;

public class EntryData{
    public static void main (String [] args) {
        //  instanciando Scanner y se guarda con el nombre de data
        Scanner data = new Scanner(System.in);

        System.out.println("Ingresa un dato (Texto)");
        String name = data.nextLine();

        System.out.println("Ingresa un numero (Entero)");
        int num = data.nextInt();



        System.out.println("El dato ingresado es: "+ name + " El numero ingresado es: "+ (num+2));


    }
}
