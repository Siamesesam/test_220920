package edu.java.loopHw;

import java.util.Scanner;

public class LoopMainHw06_02 {

    public static void main(String[] args) {
        boolean run = true;
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("\n----------------------------------");
            System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
            System.out.println("----------------------------------");
            System.out.print("선택 >> ");

            int user = scanner.nextInt();

            // enum 활용 가능 
            switch (user) {
            case 1:
                System.out.println("예금액>> ");

                balance += scanner.nextInt();
                break;
            case 2:
                System.out.println("출금액>> ");

                balance -= scanner.nextInt();
                break;
            case 3:
                System.out.println("잔고>> " + balance);

                break;
            case 4:
                run = false;
                break;

            }

        }
        System.out.println("프로그램 종료 ");
    }

}
