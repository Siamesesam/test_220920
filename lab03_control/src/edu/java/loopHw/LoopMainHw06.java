package edu.java.loopHw;

import java.util.Scanner;

public class LoopMainHw06 {

    public static void main(String[] args) {
        boolean run = true;
        int balace = 0;
        Scanner scanner = new Scanner(System.in);

        while (run) {
            System.out.println("\n----------------------------------");
            System.out.println(" 1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
            System.out.println("----------------------------------");
            System.out.print("선택 >> ");

            String user = scanner.next();

            // 왜 여기서까지의 프린트문이 두번씩 반복되는지 잘 모르겠습니다... ㅜㅜ

            switch (user) {
            case "예금":
                System.out.println("예금액>> ");
                balace += scanner.nextInt();

                break;
            case "출금":
                System.out.println("출금액>> ");
                balace -= scanner.nextInt();

                break;
            case "잔고":
                System.out.println("잔고>> " + balace);

                break;
            case "종료":
                run = false;

                break;

            }

        }
        System.out.println("프로그램 종료 ");
    }

}
