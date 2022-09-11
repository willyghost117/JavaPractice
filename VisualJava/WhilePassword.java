import javax.swing.*;
public class WhilePassword {
    public static void main (String[] args){
        String passwordSystem = "Williams";
        // String passwordUser = "";
        Boolean repeater = false;
        while ( repeater == false){
            String passwordUser = JOptionPane.showInputDialog("Ingresa tu contraseña : ");
            
            if (passwordSystem.equals(passwordUser)){
                JOptionPane.showMessageDialog(
                    null, "Contraseña correcta", "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
                    repeater = true;
            }
        }
    }
}
