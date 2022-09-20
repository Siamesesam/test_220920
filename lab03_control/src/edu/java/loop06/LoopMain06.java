package edu.java.loop06;

public class LoopMain06 {

    public static void main(String[] args) {
        // while 반복문
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        // 아 졸려 미치겠네 진짜 아오 시이빨
        //
        System.out.println("-------------------");

        int n = 1;
        while (n <= 5) {
            System.out.println(n);
            n++;
        }
        System.out.println("-------------------");
        // 10부터 1까지 정수들을 내림차순으로 한 줄에 출력하세요. (10 9 8 7 ... 2 1 )
        int a = 10;
        while (a > 0) {
            System.out.print(a);
            a--;
        }

        System.out.println("\n-------------------");
        // 10 이하의 양의 홀수들을 한 줄에 출력하세요. ( 1 3 5 7 9)
        int b = 1;
        while (b <= 9) {
            System.out.print(b);
            b += 2;
        }

        System.out.println("\n-------------------");
        n = 1;
        while (n < 10) {
            if (n % 2 == 1) {
                System.out.print(n);
            }
            n++;
        }

    }

}
