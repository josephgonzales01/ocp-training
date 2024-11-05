package com.lintyc.ClassDesign;


import com.lintyc.common.Vehicle;

class Car extends Vehicle {
    //Below year property also exist on parent Vehicle but this year property is a separate copy
    protected int year = 1995;

    public Car(String make, String model, int year, FuelType fuelType) {
        //super() must be the first statement of the constructor, else will not compile
        super(make, model, year, fuelType);
    }

    // this() refers to constructor call within the class
    // and only allowed inside a constructor
    public Car(String make, String model, int year) {
        //this() must be the first statement of the constructor, else print statement below will not compile
        //System.out.println(year);
        this(make, model, year, Vehicle.FuelType.DIESEL);
    }

    public void showYear() {
        System.out.println(year);
    }

    //this refers to this instance of the class
    public void showCarYear() {
        System.out.println(this.year);
    }

    public void showParentCarYear() {
        System.out.println(super.year);
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Hilux", 2023);
        myCar.showYear(); //1995
        myCar.showCarYear(); //1995
        myCar.showParentCarYear(); //2023
    }

}
