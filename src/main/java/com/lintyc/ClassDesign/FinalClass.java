package com.lintyc.ClassDesign;

import com.lintyc.common.Vehicle;

import java.util.ArrayList;

// final class cannot be extended
public final class FinalClass extends Vehicle {

    public FinalClass(String make, String model, int year, FuelType fuelType) {
        super(make, model, year, fuelType);
    }
}
//below extends will result to compile error
//class Car extends FinalClass {}

/*
    1. Mark the class as final or make all the constructors private.
    2. Mark all the instance variables private and final.
    3. Don’t define any setter methods.
    4. Don’t allow referenced mutable objects to be modified.
    5. Use a constructor to set all properties of the object, making a copy if needed.
 */
final class Animal { // Not an immutable object declaration
    private final ArrayList<String> favoriteFoods;

    public Animal(ArrayList<String> favoriteFoods) {
        if (favoriteFoods == null || favoriteFoods.isEmpty())
            throw new RuntimeException("favoriteFoods is required");

        //is not quite immutable, caller might update their own reference to favoriteFoods being passed
        //this.favoriteFoods = favoriteFoods;

        //this is now immutable caller does not have the new reference of ArrayList, this called defensive copy
        this.favoriteFoods = new ArrayList<>(favoriteFoods);
    }

    public int getFavoriteFoodsCount() {
        return favoriteFoods.size();
    }
}
