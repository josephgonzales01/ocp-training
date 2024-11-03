package com.lintyc.ClassInitializing;

import com.lintyc.common.Dog_NoConstructor;

/*
1. If there is a superclass Y of X, then initialize class Y first.
2. Process all static variable declarations in the order in which they appear in the class.
3. Process all static initializers in the order in which they appear in the class.
4. Static initializers are executed only once see demo in main
5. Instance initializers are executed first before any constructor
6. Initialize the constructor, including any overloaded constructors referenced with this()
*/
public class RulesOfInitializingClass {
    //Final variable must be assigned value in either declaration or in constructor or initializers
    private final String name;

    //static final variable must be assigned value on declaration or on static initializers
    private static final int age;

    static {
        age = 9;
    }

    public RulesOfInitializingClass() {
        name = "Chihuahua";
    }


    public static void main(String[] args) {
        // Demo see console for order of execution
        Dog_NoConstructor dog = new Dog_NoConstructor();

        System.out.println("\n*** Another Dog instance ***");

        //Demo no static initializers below are executed
        Dog_NoConstructor puppy = new Dog_NoConstructor();
    }

}
