package edu.java.loop08;

public class LoopMain08 {

    public static void main(String[] args) {
        // 중첩 반복문
        int n;
        // int m = 0;

        for (n = 1; n < 10; n++) {
            System.out.println(" < " + n + " 단 > ");
            for (int m = 1; m < 10; m++) {
                System.out.println(n + " x " + m + " = " + n * m);
            }

        }

        System.out.println("-----------------------------------1");

        int i = 1;
        int k = 1;

        while (i < 10) {
            // i++;
            System.out.println(" < " + i + " 단 > ");
            // i++;
            for (k = 1; k < 10; k++) {
                System.out.println(i + " x " + k + " = " + i * k);

            }
            i++;
        }

        System.out.println("-----------------------------------2");

        i = 1;

        while (i < 10) {
            System.out.println(" < " + i + " 단 > ");
            int j = 1; // 이거 쌉중요!!!!!!! ! ! ! ! ! !
            while (j < 10) {
                System.out.println(i + " x " + j + " = " + i * j);

                j++;
            }
            i++;

        }

        System.out.println("-----------------------------------3");
        // 2단은 2x2 까지 , 3단은 3까지, 4단은 4까지, ... , 9단은 9까지 출력
        int a = 2;
        while (a < 10) {
            System.out.println(" < " + a + " 단 > ");
            int b = 1; // 이거 쌉중요!!!!!!! ! ! ! ! ! !

            while (b < 10) {
                System.out.println(a + " x " + b + " = " + a * b);

                if (a == b) {
                    break;
                }
                b++;
            }
            a++;

        }

        System.out.println("-----------------------------------4");

        for (int x = 2; x < 10; x++) {
            System.out.println(" < " + x + " 단 > ");
            for (int y = 1; y <= x; y++) {
                System.out.println(x + " x " + y + " = " + x * y);
                if (x == y) {
                    break; // 안쪽 for 문을 종료
                }
            } // for (y)
        } // for (x)

        System.out.println("-----------------------------------4");

        a = 2;
        while (a < 10) {
            System.out.println(" < " + a + " 단 > ");
            //

            int b = 1;
            while (b <= a) {
                System.out.println(a + " x " + b + " = " + a * b);
                b++;
            }
            a++;
        }

        System.out.println("-----------------------------------4");
    }

}
