package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMain {

    public static void main(String[] args) {
        /*
         * 가위바위보 게임 int computer = 난수 int user = 스캐너 입력 print(computer : user) 누가 이겼는지
         * (조건문) 출력
         */
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String winner = null; // 누가 이겼는지 여부

        int computer = random.nextInt(3); // 컴퓨터가 3미만의 난수 발생

        // int = random.nextInt(3);
        // int = random.nextInt(3);
        String rsp; // 컴퓨터의 난수 결과에 따른 문자열

        if (computer == 0) {
            rsp = "바위";
        } else if (computer == 1) {
            rsp = "가위";
        } else {
            rsp = "보";
        }
        System.out.println("@@@@가위/바위/보 게임@@@@");
        System.out.println("------------------------");
        System.out.println("<보기>");
        System.out.println("[0]바위\t[1]가위\t [2]보");
        // System.out.println("[1] 가위");
        // System.out.println("[2] 보");
        System.out.println("------------------------");

        System.out.print("가위바위보를 입력하세요 >>> ");

        while (scanner.hasNextInt()) { // hasNextInt() : 정수만 입력받고싶을경우 사용, 정수가아닌 문자나 문자열이 입력될 시 while문 탈출
            int me = scanner.nextInt();

            String rspMe; // 내가 입력한 값의 문자열

            if (me != 0 && me != 1 && me != 2) {
                System.out.println("잘못된 입력입니다. <보기>에서 선택해주세요.");
                // return;
            } else {

                if (me == 0) {
                    rspMe = "바위";
                } else if (me == 1) {
                    rspMe = "가위";
                } else {
                    rspMe = "보";
                }

                // 컴퓨터의 난수에 따라 내 입력값의 조건문
                switch (computer) {
                case 0:
                    if (me == 0) {
                        winner = "무승무";
                    } else if (me == 1) {
                        winner = "컴퓨터";
                    } else {
                        winner = "나";
                    }

                    break;
                case 1:
                    if (me == 0) {
                        winner = "나";
                    } else if (me == 1) {
                        winner = "무승부";
                    } else {
                        winner = "컴퓨터";
                    }

                    break;
                case 2:

                    if (me == 0) {
                        winner = "컴퓨터";
                    } else if (me == 1) {
                        winner = "나";
                    } else {
                        winner = "무승부";
                    }

                    break;

                }

                System.out.println("컴퓨터 : " + rsp);
                System.out.println("나 : " + rspMe);
                System.out.println("승리한 사람 : " + winner);
            }
        }
        System.out.println("잘못된 입력입니다. <보기>에서 선택해주세요.");
        scanner.close(); // scanner 입력 종료

    }

}
