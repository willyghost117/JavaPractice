public class ArrayBidemensional {
    public static void main (String [] args){
        int [] [] arrayBi = new int[3][3];

        arrayBi [0] [0] = 1;
        arrayBi [0] [1] = 2;
        arrayBi [0] [2] = 3;
    

        arrayBi [1] [0] = 4;
        arrayBi [1] [1] = 5;
        arrayBi [1] [2] = 6;


        arrayBi [2] [0] = 7;
        arrayBi [2] [1] = 8;
        arrayBi [2] [2] = 9;
   

        for (int i=0;i<3; i++){
            System.out.println();
            for (int j = 0; j<3; j++){
                System.out.print(arrayBi[i][j]+" ");
            }
        }
    }
}
