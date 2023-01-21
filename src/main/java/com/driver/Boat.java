package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;



    @Override
    public String getVehicleName() {
        return "Boat";
    }

    @Override
    public int getVehicleCapacity() {
        return 8;
    }
}
