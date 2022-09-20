package edu.java.loopHw;

import java.util.Random;

public class LoopMainHw02 {

    public static void main(String[] args) {
        // Math.random 을 이용해서 두 주사위를 던져 두 눈의 합이 5가 아니면 계속 반복하고 두 눈의 합이 5가되면 프로그램을 종료하는
        // 코드를 작성해 보세요.
        // Random random = new Random();

        int dic1;// = random.nextInt();
        int dic2; // = random.nextInt();
        int dicSum1;

        while (true) {
            // 1 이상 7 미만의 실수에서 소숫점 이하를 버리고 정수 부분만 취함.
            dic1 = (int) (Math.random() * 6) + 1; // Math.random 은 double 타입의 난수 발생이므로 int 강제 타입 변환을 해야한다.
            dic2 = (int) (Math.random() * 6) + 1; // 0 <= r < 1 의 범위를 같는 Math.random 에 * 6 을 하면 0 <= 6r < 6 이므로 거기에 더하기
                                                  // 1은 한것이고
            dicSum1 = dic1 + dic2;
            System.out.println("주사위 눈 : " + "(" + dic1 + "," + dic2 + ")" + " 합 : " + dicSum1);

            if (dicSum1 == 5) {
                break;
            }

        }
        System.out.println(" 눈의 합이 5가 되었습니다. ");
        System.out.println("-----------------------------");
        // Random random = new Random(); 을 이용해 위와 같은 코드를 작성해 보세요.

        Random random = new Random(); //
        /*
         * int dic3 = random.nextInt(6) + 1; int dic4 = random.nextInt(6) + 1; int
         * dicSum2 = 0;;
         */

        while (true) {
            int dic3 = random.nextInt(6) + 1; // 1 이상 5 미만의 정수 난수를 반환
            int dic4 = random.nextInt(1, 5); // 1 이상 5 미만의 정수 난수를 반환
            int dicSum2 = 0;

            dicSum2 = dic3 + dic4;
            System.out.println("주사위 눈 : " + "(" + dic3 + "," + dic4 + ")" + " 합 : " + dicSum2);

            if (dicSum2 == 5) {
                break;
            }

        }
        System.out.println(" 눈의 합이 5가 되었습니다. ");
        System.out.println("---------------------------------");

        // 난수 생성 방법들
        double x = random.nextDouble();
        System.out.println(x);

        x = random.nextInt(1, 5); // 정수 타입 1 이상 5 미만 수 발생
        System.out.println(x);

        double y = random.nextDouble();
        System.out.println(y);

        y = random.nextDouble(10.0);
        System.out.println(y);
        // ramdom

        y = random.nextDouble(1.0, 2.0);
        System.out.println(y);

        // 난수 생성 방법 2: Math.random() 메서드를 사용
        Math.random(); // 0.0 이상 1.0 미만의 double 타입 난수를 반환하는 함수.

        y = Math.random();
        System.out.println(y);

        System.out.println("---------------------------------");
        /*
         * 무한 루프(반복문)을 만드는 방법: 1. for ( ; ; ) { ... } 2. while ( true) { ... }
         */
        /*
         * while (true) { int dic5 = random.nextInt(1, 7); int dic6 = random.nextInt(1,
         * 7); System.out.println("주사위 눈 : " + "(" + dic5 + "," + dic6 + ")" + " 합 : " +
         * dicSum3);
         * 
         * }
         */
    }

}
