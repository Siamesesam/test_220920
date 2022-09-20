package edu.java.class05;

import java.util.Scanner;

public class ClassMain05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력해주세요>> ");
        // Score 타입의 객체 생성, 메서드들을 테스트.
        Score score1 = new Score(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        // Student 타입의 객체 생성, 메서드를 테스트. 
        Student stu1 = new Student(10, "java", score1);

        stu1.print();

        System.out.println("----------------------------------1");
        System.out.println("점수를 입력해주세요>> ");

        Score score2 = new Score(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Student stu2 = new Student(11, "SQL", 100, 67, 99);

        stu2.print();

        System.out.println("----------------------------------2");
        System.out.println("점수를 입력해주세요>> ");

        Score score3 = new Score(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        Student stu3 = new Student(12, "JSP", score3);

        stu3.print();

        System.out.println("----------------------------------3");
        System.out.println("점수를 입력해주세요>> ");

        Score score4 = new Score();
        Student stu4 = new Student();
        // stu4.score = score1;

        stu4.print();

        System.out.println("----------------------------------4");
        // System.out.println("점수를 입력해주세요>> ");

        Student stu5 = new Student(3, "ohssam", new Score());
        stu5.print();
    }

}
