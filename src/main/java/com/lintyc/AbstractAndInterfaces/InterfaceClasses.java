package com.lintyc.AbstractAndInterfaces;

/*
    1. Interface are implicitly abstract
    2. no body methods on Interface are implicitly abstract and public
    3. private methods on Interface must have a body
    3. Interface variables are implicitly public, static, and final.
    6. Interface may contain a default method (with body) and can be optionally overridden by implementing class
    7. Interface may contain static method, and behave just like static methods defined in classes
 */

public interface InterfaceClasses {
    /*
        Implicitly public static final int, else explicitly declaring variable with other modifier will fail
     */
    int MAX_HEIGHT = 10;

    /*
        Implicitly public abstract void
    */
    void fly(int speed);

    /*
         private methods in interface must have a body
     */
    private void mustHaveBody() {
    }

    /*
        1. A default method may be declared only within an interface.
        2. A default method must be marked with the default keyword and include a method body.
        3. A default method is implicitly public.
        4. A default method cannot be marked abstract, final, or static.
        5. any method with a body implementation must be marked as default, unless its private
     */
    default double getTemperature() {
        return 10.0;
    }

    /*
        1. A static method must be marked with the static keyword and include a
            method body.
        2. A static method without an access modifier is implicitly public.
        3. A static method cannot be marked abstract or final.
        4. A static method is not inherited and cannot be accessed in a class implementing the
            interface without a reference to the interface name.
     */
    static boolean hasTeeth() {
        return true;
    }

}

interface Herbivore {
    public void eatPlants();
}

interface Omnivore {
    public void eatPlants();
}

class Bear implements Herbivore, Omnivore {

    /*
        compatible to both inherited abstract methods, if one of the abstract method differ in return type this will fail
     */
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}
