package edu.java.inheritance09;

public class AbstractMain03 {

    public static void main(String[] args) {
        // Rectangle, Circle 클래스를 구현
        // rectangle, Circle 타입의 객체에서 draw() 메서드 동작 여부 테스트

        Rectangle rec1 = new Rectangle("직사각형", 4, 5);
        Circle cir1 = new Circle("원", 6);

        System.out.println(rec1);
        System.out.println();
        System.out.println(cir1);
        System.out.println();
        rec1.draw();
        cir1.draw();

        System.out.println();

        Shape[] shapes = { new Rectangle("직사각형", 4, 3), new Circle("원", 10), new Square("정사각형", 9) };

        for (Shape s : shapes) {
            s.draw();
        }

    }

}
