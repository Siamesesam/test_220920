package edu.java.switch03;

public class SwitchMain03 {
    public static void main(String[] args) {
        Season s = Season.SUMMER;
        System.out.println(s.ordinal());
        switch (s) {
        case SPRING:
            System.out.println("봄");
            break;
        case SUMMER:
            System.out.println("여름");
            // break;
        case FALL:
            System.out.println("가을");
            break;
        case WINTER:
            System.out.println("겨울");
            break;
        }
    }

}
