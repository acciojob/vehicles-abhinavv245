package com.driver;

public class Boat implements WaterVehicle{

    private String name="boat";
    private int capacity=6;

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return capacity;
    }
}
