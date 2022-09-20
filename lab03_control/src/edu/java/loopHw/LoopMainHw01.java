package edu.java.loopHw;

public class LoopMainHw01 {

    public static void main(String[] args) {
        // for 문을 이용해서 1 부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성해 보세요.
        int i;
        int sum = 0;

        for (i = 3; i <= 100; i++) {
            // int sum = 0;
            if (i % 3 == 0) {

                sum = sum + i;
                System.out.println("누적 수 : " + sum);
            }

        }
        System.out.println("3의 배수의 총 합은 : " + sum);
        System.out.println("-------------------------------");
        // for 문을 이용해 1 ~ 100 까지 수의 총합을 구하는 코드를 작성해 보세요.

        sum = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
            System.out.println("누적 수 : " + sum);
        }

        System.out.println("1부터 100까지수의 총 합은 : " + sum);
        System.out.println("-------------------------------");

        i = 0;
        sum = 0;
        for (i = 3; i <= 100; i += 3) {
            // int sum = 0;

            sum = sum + i;
            // System.out.println("누적 수 : " + sum);

        }
        System.out.println("3의 배수의 총 합은 : " + sum);
        System.out.println("-------------------------------");

        sum = 0;
        i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                sum += i;
                System.out.println("누적 수 : " + sum);
            }
            i++;
        }
        System.out.println("3의 배수들의 합3 = " + sum);

    }

}
