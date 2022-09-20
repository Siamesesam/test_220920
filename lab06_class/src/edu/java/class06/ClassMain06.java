package edu.java.class06;

import java.util.Scanner;

public class ClassMain06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account1 = new Account(1123456789, 100000);
        Account account2 = new Account(1987654321, 20000);

        account1.printAccountInfo();

        System.out.print("입금하실 금액을 입력하세요>> ");
        account1.deposit(scanner.nextDouble());
        account1.printAccountInfo();

        System.out.print("출금하실 금액을 입력하세요>> ");
        account1.withdraw(scanner.nextDouble());
        account1.printAccountInfo();

        System.out.print("이체할 금액을 입력하세요>> ");
        account1.transfer(account2, scanner.nextDouble());
        account1.printAccountInfo();
        System.out.println("===========================");
        account2.printAccountInfo();

    }

}
