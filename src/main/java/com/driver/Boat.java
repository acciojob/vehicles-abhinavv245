package com.driver;

public class Boat implements WaterVehicle{

    private String name;
    private int capacity;

    public Boat() {
        this.name="Titanic";
        this.capacity=8;
    }

    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
