package edu.java.condition02;

public class ConditionMain02 {

    public static void main(String[] args) {
        // 중첩 조건문
        // float x = 3.14f;
        double x = 3.14;
        
        // if- else if-else 문장
        if(x > 0) {
            System.out.println("양수");
        } else if(x <0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }
        
        if(x > 0) {
            // TODO
            // FIXME
            System.out.println("positive");
        } else {
            // 중첩 조건문 
            if(x < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }
    }

}
