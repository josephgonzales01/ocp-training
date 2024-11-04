package com.lintyc.AbstractAndInterfaces;

/*
    1. Abstract Classes cannot be final and cannot be instantiated e.g using new
    2. Only method can be declared abstract, not variables, constructors and static methods
    3. Abstract class may contain a non-abstract method , method with body
    4. Abstract method cannot be private (cannot be inherited), abstract method cannot be static either since it's too
        cannot be overridden
    5. Concrete class (Non-abstract) that extends abstract class must implement all inherited abstract method
    6. Abstract class may contain Constructor but only be initialized via its implementing Concrete class

 */
public class AbstractClasses {
}

abstract class Canine {
    public abstract String getSound();

    /*
        Compile error, even though body is empty, there should be no body at all and must end with semicolon ();
     */
    //public abstract boolean hasFangs(){}

    public void bark() {
        System.out.println(getSound());
    }
}

/*
    Abstract class may only contain non-abstract method,
    and may contain constructor
 */
abstract class Cat {
    //if no constructor provided the compiler will generate a default no-arg constructor
    public Cat() {
        System.out.println("Meow..");
    }

    public void scratch() {
    }
}

class Wolf extends Canine {
    public String getSound() {
        return "Wooooooof!";
    }
}

class Fox extends Canine {
    public String getSound() {
        return "Squeak!";
    }
}

class Coyote extends Canine {
    public String getSound() {
        return "Roar!";
    }
}
