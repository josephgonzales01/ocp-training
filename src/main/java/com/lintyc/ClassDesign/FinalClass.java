package com.lintyc.ClassDesign;

import com.lintyc.common.Vehicle;

// final class cannot be extended
public final class FinalClass extends Vehicle {

    public FinalClass(String make, String model, int year, FuelType fuelType) {
        super(make, model, year, fuelType);
    }
}
//below extends will result to compile error
//class Car extends FinalClass {}
