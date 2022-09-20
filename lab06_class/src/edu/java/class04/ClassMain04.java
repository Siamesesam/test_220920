package edu.java.class04;

import edu.java.class04.Circle;

public class ClassMain04 {

    public static void main(String[] args) {
        // Rectangle 타입 변수 선언, Rectangle 객체 생성 저장. 
        Circle circle1 = new Circle();

        // Rectangle 객체의 메서드 테스트. 
        System.out.println("반지름: " + circle1.radius + "cm");
        System.out.println("둘레: " + circle1.round() + "cm");
        System.out.println("넓이: " + circle1.area() + "cm^2");

        System.out.println("-----------------------");

        // Rectangle 타입 변수 선언, Rectangle 객체 생성 저장. 
        Circle circle2 = new Circle(4);

        // Rectangle 객체의 메서드 테스트. 
        System.out.println("반지름: " + circle2.radius + "cm");
        System.out.println("둘레: " + circle2.round() + "cm");
        System.out.println("넓이: " + circle2.area() + "cm^2");

        // 생성자를 호출할 때마다 메모리의 다른 주소에 다른 객체가 만들어짐. 
    }

}
