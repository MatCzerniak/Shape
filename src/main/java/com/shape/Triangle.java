package com.shape;

public class Triangle implements Shape{
    private final String shapeName;
    private final double field;

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }


    public Triangle(double sideLength, double heightLength) {
        this.shapeName = "triangle";
        this.field = sideLength * heightLength * 0.5;

    }

    @Override
    public String toString() {
        return "Triangle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
