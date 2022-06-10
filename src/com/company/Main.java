package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Car car=new Car(3254,111);
        Car car1=new Car(3435,777);
        Car car2=new Car(3254,515);
        Car car3=new Car(5643,517);
        Car car4=new Car(3251,555);
        CarDannye carDannye=new CarDannye(2008,"HondaFit",440000,"White pearl");
        CarDannye carDannye1=new CarDannye(2010,"HondJaz",500000,"Blake pearl");
        CarDannye carDannye2=new CarDannye(2011,"BMW",550000,"Grey");
        CarDannye carDannye3=new CarDannye(2014,"Mers",580000,"Red");
        CarDannye carDannye4=new CarDannye(2016,"Camry",600000,"Blake");
        HashMap<Car,CarDannye>maps=new HashMap<>();
        maps.put(car,carDannye);
        maps.put(car1,carDannye1);
        maps.put(car2,carDannye2);
        maps.put(car3,carDannye3);
        maps.put(car4,carDannye4);

        for (Map.Entry a: maps.entrySet()) {
            System.out.println(a.getKey()+" "+a.getValue());

        }



    }
}
