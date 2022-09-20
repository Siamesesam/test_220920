package edu.java.loop04;

public class LoopMain04 {

    public static void main(String[] args) {
        // 반복문에서 break vs continue
        // 싸라싸리싸싸싸 ~~ !
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 3) {
                break;
            }
        }
        System.out.println("---------------------");
        
        for (int n = 1; n <= 5; n++) {
            if (n == 3) {
                continue;
            }
            System.out.println(n);
        }
    }

}
