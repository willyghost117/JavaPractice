public class ArrayForEach2 {
    public static void main (String [] args){
        int [] arrayAleatory = new int [50];

        for (int i=0; i < arrayAleatory.length; i++){
            arrayAleatory[i] = (int)Math.round(Math.random()*10);
        }

        for (int element:arrayAleatory){
            System.out.print(element+",");
        }
    }
}
