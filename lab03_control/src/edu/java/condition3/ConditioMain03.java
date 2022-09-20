package edu.java.condition3;

import java.util.Scanner;

public class ConditioMain03 {

    public static void main(String[] args) {
        /*
         * Scanner 타입의 변수 선언, 초기화. int 타입 변수에 콘솔에서 입력한 정수를 저장. 입력한 점수가 90 이상이면, A 80
         * 이상이면, B 70 이상이면, C 60 이상이면, D 60 미만이면, F 출력
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력해주세요 >>> ");

        int score = scanner.nextInt();
        
        if (score <= 100) {
            if (score >= 90) {
                System.out.println("학생 점수 : " + score);
                System.out.println("A학접입니다.");
            } else if (score >= 80) {
                System.out.println("학생 점수 : " + score);
                System.out.println("B학접입니다.");
            } else if (score >= 70) {
                System.out.println("학생 점수 : " + score);
                System.out.println("C학접입니다.");
            } else if (score >= 60) {
                System.out.println("학생 점수 : " + score);
                System.out.println("D학접입니다.");
            } else {
                System.out.println("학생 점수 : " + score);
                System.out.println("F학접입니다.");
            }
        } else {
            System.out.println("임마임마 어떻게 점수가 100점이 넘냐!!!!!!!!!!!!!");
        
        }
    }
}
