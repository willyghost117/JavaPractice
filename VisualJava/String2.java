public class String2 {
    public static void main (String [] args){
        //  Sub string 
        //  Se puede almacenar varias cadenas en una variable de tipo String
        String phase = "Hoy es un buen dia para programar";
        
        String phaseShort = phase.substring(0, 3) + " es hoy";

        String phase2 = "hola "+ "adios";

        System.out.println(phaseShort);
        System.out.println(phase2);
    }
}
