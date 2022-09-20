package edu.java.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsMainOh01 {

    public static void main(String[] args) {
        /*
         * 가위바위보 게임 가위 0, 바위 1, 보 2
         * 
         * 컴퓨터의 가위/바위/보는 (정수) 난수로 만듦. int user = 스캐너 입력 pring(computer : user) 누가 이겼는지
         * (조건문) 출력
         */

        Random random = new Random();
        int computer = random.nextInt(3);
        String rsp;
        // 사용자는 콘솔창에서 키보드로 가위/ 바위/ 보에 해당하는 정수를 입력.
        System.out.println("@@@@가위/바위/보 게임@@@@");
        System.out.println("------------------------");
        System.out.println("<보기>");
        System.out.println("바위\t가위\t 보");
        System.out.println("------------------------");

        System.out.print("가위바위보를 입력하세요 >>> ");

        Scanner scanner = new Scanner(System.in);

        String user = scanner.next();

        if (computer == 0) {
            rsp = "바위";
        } else if (computer == 1) {
            rsp = "가위";
        } else {
            rsp = "보";
        }

        System.out.println("computer : " + rsp);
        System.out.println("user : " + user);

        switch (computer) {
        case 0:
            if (user == "바위") {
                System.out.println("무승부");
            } else if (user == "가위") {
                System.out.println("computer 승!!!!");
            } else {
                System.out.println("user 승!!!!");
            }
            break;
        case 1:
            if (user == "바위") {
                System.out.println("user 승!!!!");
            } else if (user == "가위") {
                System.out.println("무승부");
            } else {
                System.out.println("computer 승!!!!");
            }
            break;
        default:
            if (user == "바위") {
                System.out.println("computer 승!!!!");
            } else if (user == "가위") {
                System.out.println("user 승!!!!");
            } else {
                System.out.println("무승부");
            }
            break;

        }
        System.out.println("------------------------");
        System.out.println("@@@@가위/바위/보 게임@@@@");
        System.out.println("------------------------");
        System.out.println("<보기>");
        System.out.println("[0]바위\t[1]가위\t [2]보");
        System.out.println("------------------------");

        System.out.print("가위바위보를 입력하세요 >>> ");

        int user1 = scanner.nextInt();

        System.out.println("computer : " + rsp);
        System.out.println("user : " + user1);

        if (user1 == computer) {
            System.out.println("무승부");

        } else if ((user1 == 0 && computer == 2) || (user1 == 1 && computer == 0) || (user1 == 2 && computer == 1)) {
            System.out.println("user 승!!!!");
        } else {
            System.out.println("computer 승!!!!");
        }

    }

}
