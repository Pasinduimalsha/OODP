package com.AbstractFactory;

// Explain the purpose of class
// This class is a concrete class that implements the Shape interface
// It provides the implementation of the draw method
// What is the concrete class?
// RoundedSquare. It is a concrete class that implements the Shape interface
// Meaning of concrete class.
// A concrete class is a class that provides an implementation for all the methods declared in an interface or inherited from an abstract class
public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}

