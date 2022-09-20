package edu.java.inheritance09;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String type, double width, double height) {
        super(type);
        this.width = width;
        this.height = height;
    }
    @Override
    public double area() {
        
        return width * height;

    }
    @Override
    public double perimeter() {
        return 2 * (width + height);

    }

    @Override
    public String toString() {
        String rectangle = String.format("가로: %f, 세로: %f", width, height);
        return rectangle;
    }

}