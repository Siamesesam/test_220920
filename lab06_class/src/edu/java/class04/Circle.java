package edu.java.class04;

public class Circle {
    // field - 반지름
    double radius;
    static double pi = 3.141592653589793238;
    // constructor - 기본 생성자, argument를 갖는 생성자
    public Circle() {
        // default constructor
    } // end Circle
    
    public Circle(double radius ) {
        this.radius = radius;
    } // end Circle
    // method - 둘레 길이, 넓이
    
    public double round() {
      return 2 * pi * radius;  
    } // end round
    
    public double area() {
      return Math.PI * radius * radius;  
    } // end area
    
}
