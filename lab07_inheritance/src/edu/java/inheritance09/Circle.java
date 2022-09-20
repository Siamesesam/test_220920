package edu.java.inheritance09;

public class Circle extends Shape {
    private double radius;

    public Circle(String type, double radius) {
        super(type); // 파라미터를 뺴주고 super("직사각형"); 와 같이 직접 문자열을 넣어주는것도 가능하다. 
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

}
