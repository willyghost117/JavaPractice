import java.util.*;
import javax.swing.*;
public class Area {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Elije una opcion \n1: Cuadrado \n2: Rectangulo \n3: Triangulo \n4: Circulo ");

        int figure = scanner.nextInt();

        switch(figure){
            
            case 1:
            int height = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura"));
            int base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base"));
            int result = height * base;
            JOptionPane.showMessageDialog(
                null,""+ result,"El resultado es",JOptionPane.INFORMATION_MESSAGE);
            break;

            case 2:
            base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base de la figura : "));
            height =  Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura de la figura: "));
            JOptionPane.showMessageDialog(
                null, "el resultado es " + (base * height), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 3:
            base = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la base de la figura  :")) ;
            height = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la altura de la figura :"));
            JOptionPane.showMessageDialog(
                null, "El resultado es : " +((base * height)/2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 4:
    
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el radio "));
            JOptionPane.showMessageDialog(
                null, "El resultado es : " + Math.round(Math.PI * (Math.pow(radio, 2))), "Resultado", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
            
    }
}
