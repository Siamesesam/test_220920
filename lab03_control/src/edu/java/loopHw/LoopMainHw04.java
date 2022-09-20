package edu.java.loopHw;

public class LoopMainHw04 {

    public static void main(String[] args) {
        String tree = "*";
        String sp = " ";

        int i;
        int j;
        for (i = 1; i < 5; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(tree);
            }
            System.out.println(sp);

        }

        for (int a = 1; a <= 4; a++) { // 4번 반복하면서
            for (int b = 1; b <= a; b++) { // a번 반복하면서
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
