import javax.swing.*;
public class DoWhileIMC {
    public static void main(String[] args) {
        String genre;
        do{
            genre = JOptionPane.showInputDialog("Ingresa tu genro H/M");
            // nota se usa equalsIgnore Case para este while
        }while(genre.equalsIgnoreCase("H")==false && genre.equalsIgnoreCase("M")==false);

        int tall = Integer.parseInt(JOptionPane.showInputDialog("Ingresa tu altura en centimetros"));
        
        int idealWeight=0;
        if ( genre.equals("h")){
            idealWeight = tall - 110;
        }
        
        else if (genre.equals("M")){
            idealWeight = tall - 120;
        }

        System.out.println("El peso ideal es : " + idealWeight);
    }
}
