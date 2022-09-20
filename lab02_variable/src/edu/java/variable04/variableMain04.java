package edu.java.variable04;

import java.util.Scanner;

public class variableMain04 {

    public static void main(String[] args) {
        /*
         * 콘솔 창에서 키보드로 숫자를 입력받아서 변수에 저장. 1. Scanner 타입의 변수를 선언하고 초기화. 2. Scanner 객체를
         * 사용해서 콘솔 창에서 정수를 입력받고 저장.
         */

        Scanner scanner = new Scanner(System.in);
        /*
         * System.out.print("정수를 입력>>> "); int number = scanner.nextInt();
         * System.out.println("number = " + number);
         */

        // 시험점수에 대한 총점과 평균을 구하는 프로그램

        // 총점, 평균

        System.out.print("Java 시험 점수(정수)를 입력하세요 >>> ");
        int java = scanner.nextInt();

        System.out.print("SQL 시험 점수(정수)를 입력하세요 >>> ");
        int sql = scanner.nextInt();

        System.out.print("JSP 시험 점수(정수)를 입력하세요 >>> ");
        int jsp = scanner.nextInt();

        // double subjectNum = 3;
        int sum = java + sql + jsp;
        // double avg = sum / subjectNum; // 과목수 변수가 없을경우 => double avg = sum / 3.0;
        double avg = (double) sum / 3;

        System.out.println("-----------------------------");
        System.out.println("Java 점수 : " + java);
        System.out.println("SQL 점수 : " + sql);
        System.out.println("JSP 점수 : " + jsp);
        System.out.println("시험 점수 총합 : " + sum);
        System.out.println("시험 점수 평균 : " + avg);
        System.out.println("-----------------------------");

    }

}
