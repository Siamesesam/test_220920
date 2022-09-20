package edu.java.loopHw;

public class LoopMainHw03 {

    public static void main(String[] args) {
        // 4x + 5y = 60 모든 해 구하기. 단, x, y 는 10이하의 자연수.
        int x = 1;
        int y = 1;

        for (x = 1; x <= 10; x++) {
            for (y = 1; y <= 10; y++) {
                if (4 * x + 5 * y == 60) {
                    System.out.println(" 4x + 5y = 60 이 될 경우의 해 : " + x + ", " + y);
                }

            }
        }

    }

}
