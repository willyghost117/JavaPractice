import java.security.Principal;
import java.util.*;
public class WhileGame1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        // refuncion convertir un dato en otro 
        int num = (int)(Math.random()*10);
        int numUser = 0;
        int retries =0;

        // System.out.println(num);
        while (num !=numUser ){
            System.out.println("Intenta adivinar el numero puede ser del 1 al 10"); 
            numUser = scanner.nextInt();
            retries++;

            if (retries >= 5){
                System.out.println("Ya no tienes mas intentos el numero era " + num);
                break;
            }else if (num < numUser){
                System.out.println("Pista--El numero aleatorio es menor al que ingresaste ");
            }else if (num > numUser){
                System.out.println("Pista--El numero aleatorio es mayor al  que ingresaste");
            }

        }
        if ( num == numUser){
            System.out.println("Has gando el juego con :"+ retries + " intentos ");
        }
    }
}
