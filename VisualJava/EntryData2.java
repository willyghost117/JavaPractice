import javax.swing.*;
public class EntryData2 {
    public static void main (String [] args){
        String name = JOptionPane.showInputDialog("Ingresa tu nombre:");

        String age = JOptionPane.showInputDialog("Ingresa tu edad: ");
        int age1 = Integer.parseInt(age);
        age1++; 
        System.out.println("Tu nombre es :" + name +" en tu cumpleaños proximo tendras :" + age1);
    }
}
