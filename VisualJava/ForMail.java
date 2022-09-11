import javax.swing.*;
public class ForMail {
    public static void main ( String [] args){

        int check =0;

        String email = JOptionPane.showInputDialog("Ingresa tu email : ");
        int couter = email.length();
        
        for (int i=0; i<couter; i++ ){
            if (email.charAt(i)=='@'){
                check++;
            }
        }
        if (check == 1){
            System.out.println("Tu correo es valido");
        }
        else if (check != 1){
            System.out.println("Ingresa un correo valido");
        }
    }
}
