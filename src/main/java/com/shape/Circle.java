package com.shape;

public class Circle implements Shape {
    private final String shapeName;
    private final double field;

    public String getShapeName() {
        return shapeName;
    }

    public double getField() {
        return field;
    }

    public Circle(double radius) {
        this.shapeName = "circle";
        this.field = Math.PI * radius * radius;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "shapeName='" + shapeName + '\'' +
                ", field=" + field +
                '}';
    }
}
