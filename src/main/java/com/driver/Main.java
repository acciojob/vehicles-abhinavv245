package com.driver;

public class Main {
    public static void main(String[] args) {
        F1 mercedes = new F1("mercedes", false);
        mercedes.move(40, 0);
        mercedes.accelerate(20);
        mercedes.accelerate(-60);

  Boat boat=new Boat();
        System.out.println(boat.getVehicleCapacity());
        System.out.println(boat.getVehicleName());

        Boat b= new Boat("St.michaels",16);
        System.out.println(b.getVehicleName());
        System.out.println(b.getVehicleCapacity());

    }
}