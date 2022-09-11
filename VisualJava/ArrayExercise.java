// se simula un interes de 10%(mensual x 4 meses) sobre 10 000 de capital
// y tambien el 11 % el 12% el 13% 14% 15% %16 enteres, la primera columna representa el capital

import javax.swing.*;
public class ArrayExercise {
    public static void main(String[] args) {

        double accumulated;
        double interest = 0.10;
        double [] [] arrayBalance = new double[6][5];

        for (int i=0; i<6; i++){
            //arrayBalance[i][0] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad: "));
            arrayBalance[i][0] = 10000;
            //accumulated = arrayBalance[i][0];
            accumulated = 10000;
            
            for (int j =1;j<5;j++){
                accumulated = accumulated+(accumulated*interest);
                arrayBalance[i][j] = accumulated; 
            }

            interest = interest+0.01;
        }
        for (int i=0; i<6; i++){
            System.out.println();
            
            for (int j =0;j<5;j++){
                System.out.print(arrayBalance[i][j]+  "                 ");

            }
        }
    }
}
