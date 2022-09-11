import javax.swing.*;
public class ArrayForEach {
    public static void main(String [] args){

        String [] countries = new String[3];
        

        // recorrido de un array en for normal
        for (int i = 0;i < countries.length; i++){
            countries [i] = JOptionPane.showInputDialog("Ingresa paises "+(i+1));
        }

        // recorrido de un array por for Each
        
        for (String element:countries ){
            System.out.println("Pais "+element);
        }

    }
}
