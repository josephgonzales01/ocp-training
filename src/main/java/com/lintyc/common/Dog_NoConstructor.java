package com.lintyc.common;

public class Dog_NoConstructor extends Animal_NoConstructor {

    //By default super() constructor is implicitly called
    public Dog_NoConstructor() {
        System.out.println("Dog  no args constructor");
    }

    static {
        System.out.println("Dog static initializer");
    }

    //Instance Initializer is executed first before any constructor, but after static initializer and static variables
    {
        System.out.println("Dog instance initializer");
    }

}
