package Poo;
public class Car {
    private int wheel;
    private int length;
    private int width;
    private int engine;
    private int weight;
    private int weightTotal;
    private String color;
    private Boolean leatherSeating, airConditioner;
    //  Metodo constructor
    public Car(){ 
        wheel = 4;
        length = 2000;
        width = 300;
        engine = 1500;
        weight = 500;
    }

    public void setColor (String color){
        this.color = color;
    }

    public void setSeating (String leatherSeating) {
        if (leatherSeating.equals("si")){
            this.leatherSeating = true;
        }else {
            this.leatherSeating = false;
        }
    }
    public String getData (){
        return "Las ruedas del carro son: " + wheel + " El lago es (cm) "+ length +
         " el ancho es (cm)" + width + " el motor es de (caballos)" + engine + " el peso es (kilos)" + weight;
    }

    public String getColor (){
        return "El color del carro es " + color;
    }

    public String getSeating (){
        if (this.leatherSeating == true){
            return "El carro tiene asientos de cuero";
        }else{
            return "El carro tiene asientos de serie";
        }
    }
}
