package edu.java.loopHw;

public class LoopMain05 {

    public static void main(String[] args) {
        String tree = "*";
        String sp = " ";

        int i;
        int j;
        for (i = 1; i < 5; i++) {
            for (j = 4; j > 0; j--) {
                if (i < j) {
                    System.out.print(sp);
                } else {
                    System.out.print(tree);
                }
            }
            System.out.println(sp);
        }

        System.out.println("-----------------------");
        // 와 이건 좀 어렵다 ...... 입가서 다시 해봐야 좀 이해할꺼 같은데....;;;;;;;;
        for (int a = 1; a < 6; a++) {
            int spaces = 6 - a; // a 번째 줄에서 출력할 공백 갯수
            for (int b = 1; b < spaces; b++) { // spaces 갯수만큼 반복하면서
                System.out.print(" "); // 공백 출력
            }
            for (int b = 1; b < a; b++) { // 라인 수만큼 반복하면서
                System.out.print("*"); // 별 출력
            }
            System.out.println(); // 줄바꿈
        }

        System.out.println("-----------------------");
        i = 0;
        j = 0;
        for (i = 1; i <= 4; i++) { // 라인 수가 1 ~ 4 까지
            for (j = 4; j >= 1; j--) { // 각 줄에서 자릿수 4 ~ 1 까지
                if (j > i) { // 출력할 자릿수가 라인 숫자보다 크면
                    System.out.print(" "); // 공백
                } else { // 출력 위치가 라인 숫자보다 작거나 같으면
                    System.out.print("*"); // 별표
                }
            }
            System.out.println(); // 줄바꿈
        }

    }
}
