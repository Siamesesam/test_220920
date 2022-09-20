package edu.java.exception03;

import java.util.Scanner;

public class ExceptionMain03 {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ExceptionMain03 app = new ExceptionMain03();

        int x = app.inputInteger();
        System.out.println("x = " + x);
    }

    private int inputInteger() {
        // TODO: Scanner를 사용해서 입력받은 정수를 리턴.
        // Integer.parseInt(), scanner.nextLine() 사용.
        // NumberFormatException을 처리. 
//        int x = 0;
        while (true) {
            try {
                System.out.print("정수를 입력하세요>> ");
                int x = Integer.parseInt(scanner.nextLine());
                return x;

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());

            }
        }
    }
}
