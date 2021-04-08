package com.shape;

public class Square implements Shape{
    private final String shapeName;
    private final double field;

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }

    public Square(double sideLenght) {
        this.shapeName = "square";
        this.field = sideLenght * sideLenght;

    }

    @Override
    public String toString() {
        return "Square{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}


