import javax.swing.*;
public class ForFactorial {
    public static void main (String [] args){

        int factorial = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero para saber su factorial"));
        int result = 1;
        for (int i=factorial; i>0;i--){
            
            result = result * i;
            System.out.println(result);
        }
        System.out.println(result);
    }
}
