public class String1 {
    public static void main(String [] aStrings){
        String name = "Juan";

        int  result = name.length();

        char result1 = name.charAt(3);

        System.out.println(result);
        System.out.println(result1);
        System.out.println( "Ultima letra "+ name.charAt(result-1) );

    }
}
