package com.lintyc.common;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private FuelType fuelType;

    public enum FuelType {DIESEL, ELECTRIC, HYBRID, PETROL, PLUGIN_HYBRID}


    public Vehicle(String make, String model, int year, FuelType fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }


}