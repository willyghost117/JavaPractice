
public class ArrayBidemensionalEach {
    public static void main (String [] args){
        int [][] arrayBi={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for (int[] element:arrayBi){
            System.out.println();
            for (int element2:element)
                System.out.print(element2+" ");
        }
    }
}
