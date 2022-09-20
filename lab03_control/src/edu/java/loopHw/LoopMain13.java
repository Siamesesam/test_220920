package edu.java.loopHw;

import java.util.Scanner;

public class LoopMain13 {

    public static void main(String[] args) {
        // Ex 4-7
        boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정할 변수.
        int balace = 0; // 은행 계좌의 잔고를 저장할 변수.
        Scanner scanner = new Scanner(System.in); // 콘솔창에서 키보드로 입력받기 위한 도구.

        while (run) {
            System.out.println("\n----------------------------------");
            System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
            System.out.println("----------------------------------");
            System.out.print("선택 >> ");

            int menu = scanner.nextInt(); // 1 ~ 4 정수 입력
            switch (menu) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            }

        }
        System.out.println("프로그램 종료");
    }

}
