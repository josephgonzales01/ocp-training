package com.lintyc.common;

public class Animal_NoConstructor {
    //By default, no argument constructor implicitly generated below if no other constructor exist
    //public Animal_NoConstructor(){}

    public Animal_NoConstructor() {
        System.out.println("Animal  no args constructor");
    }

    //This block is executed only once, regardless how many instance of this class is created
    //Static initializer is also executed before an instance of this class is created
    static {
        System.out.println("Animal Static initializer");
    }
}
