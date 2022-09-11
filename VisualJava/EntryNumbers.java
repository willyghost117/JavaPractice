import javax.swing.JOptionPane;

public class EntryNumbers {
    public static void main (String [] args ){

        double num = 10000/3.4;
        //  System.out.printf("%1.2f",num);

        String num1 = JOptionPane.showInputDialog("Introduce un numero ");

        double operation = Double.parseDouble(num1);

        //  double result = operation/3.12;

        System.out.printf("%1.2f",Math.sqrt(operation));
    }
}
