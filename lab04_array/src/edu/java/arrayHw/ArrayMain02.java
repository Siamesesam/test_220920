package edu.java.arrayHw;

import java.util.Scanner;

public class ArrayMain02 {

    public static void main(String[] args) {
        // 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다. 실행결과를 보고 알맞게
        // 작성해보세요.

        boolean run = true;
        int studentNum = 0;
        int[] scores = null;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("------------------------------------------");
            System.out.print("선택>> ");

            int selectNo = Integer.parseInt(scanner.nextLine());

            if (selectNo == 1) {
                System.out.print("학생수> ");
                studentNum = scanner.nextInt();
                System.out.println("sutdentNum" + studentNum);
                
            } else if (selectNo == 2) {
                // scores[studentNum] = null;
                for (int i = 0; i < scores.length; i++) {
                    scores[i] = scanner.nextInt();
                    // System.out.println("scores[i]> " + scores[i]);
                }

            } else if (selectNo == 3) {
                for (int i = 0; i < scores.length; i++) {
                    System.out.println("scores[i]> " + scores[i]);
                }

            } else if (selectNo == 4) {

            } else if (selectNo == 5) {
                run = false;
            }

        }
        System.out.println("프로그램 종료");
    }

}
