public class String3 {
    public static void main (String [] args){
        
        //  equals compara cadenas
        String name1, name2;

        name1 = "David";
        name2 = "DaviD";
        String name3 = "David"; 

        boolean result = name1.equals(name2);
        boolean result2 = name1.equals(name3);
        boolean result4 = name1.equalsIgnoreCase(name2);


        System.out.println(result);
        System.out.println(result2);
        System.out.println(result4);

    }
}
