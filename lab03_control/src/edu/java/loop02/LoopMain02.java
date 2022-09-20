package edu.java.loop02;

public class LoopMain02 {

    public static void main(String[] args) {
        // 0 2 4 6 8 10을 한 줄씩 출력하는 프로그램
        for (int i = 0; i <= 10; i++) {
            System.out.println((i += 1) - 1 + ", ");
        }
        System.out.print("--------------------");

        for (int j = 0; j <= 5; j++) {
            int sum = 0;
            System.out.println((sum = j * 2) + ", ");
        }
        System.out.print("--------------------");

        for (int k = 0; k <= 10; k += 2) {
            System.out.println(k + ", ");
        }
        System.out.print("--------------------");
        
        for (int n = 0; n <= 5; n++) {
            System.out.println(n * 2 + ", ");
        }
        System.out.print("--------------------");
        
        for (int m = 0; m <= 10; m++) {
            if (m % 2 == 0) {
                System.out.println(m + ", ");
            }
        }
        
    }
    

}

// i = i + 1