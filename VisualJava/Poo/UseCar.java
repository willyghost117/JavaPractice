package Poo;

import java.util.Scanner;

public class UseCar {
    public static  void main (String [] args){
        // instancia de la clase Car
        Car car = new Car();
        Scanner scanner = new Scanner(System.in);

        String color = scanner.nextLine();

        car.setColor(color);

        car.setSeating("si");

        System.out.println(car.getData());
        System.out.println(car.getColor());
        System.out.println(car.getSeating());
        
    }
}
