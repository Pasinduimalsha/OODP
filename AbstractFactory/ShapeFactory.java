package com.AbstractFactory;

public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String shapeType) {

        if(shapeType.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
