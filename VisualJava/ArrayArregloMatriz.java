public class ArrayArregloMatriz{
    public static void main (String [] args){

        int[] firstArray= new int[5];

        firstArray[0] = 5;
        firstArray[1] = 6;
        firstArray[2] = 7;
        firstArray[3] = 8;
        firstArray[4] = 9;
        
        //System.out.println(i);

        for (int i=firstArray.length-1; i>=0; i--){
            int result = firstArray[i];
            System.out.println(result);
        }

        int [] secondArray = {1,2,3,4,5};

        for (int i =0;i < secondArray.length; i++){
            System.out.println(secondArray[i]);
        }
    }
}