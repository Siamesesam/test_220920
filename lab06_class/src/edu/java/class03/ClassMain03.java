package edu.java.class03;

public class ClassMain03 {

    public static void main(String[] args) {
        // Rectangle 타입 변수 선언, Rectangle 객체 생성 저장. 
        Rectangle rectangle1 = new Rectangle();

        // Rectangle 객체의 메서드 테스트. 
        System.out.println("가로: " + rectangle1.width + "cm");
        System.out.println("세로: " + rectangle1.height + "cm");
        System.out.println("둘레: " + rectangle1.round() + "cm");
        System.out.println("넓이: " + rectangle1.area() + "cm^2");
        
        System.out.println("-----------------------");

        // Rectangle 타입 변수 선언, Rectangle 객체 생성 저장. 
        Rectangle rectangle2 = new Rectangle(4, 6);

        // Rectangle 객체의 메서드 테스트. 
        System.out.println("가로: " + rectangle2.width + "cm");
        System.out.println("세로: " + rectangle2.height + "cm");
        System.out.println("둘레: " + rectangle2.round() + "cm");
        System.out.println("넓이: " + rectangle2.area() + "cm^2");
        
    }

}
