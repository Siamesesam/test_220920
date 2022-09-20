package edu.java.loop01;

public class LoopMain01 {

    public static void main(String[] args) {
        // 
        for (int i = 0; i < 5; i++) {
            System.out.println("Java " + i);
        }
        
        // 10부터 1까지 내림차순 출력: 10 9 8 ... 2 1
        
        for (int j = 10; j > 0; j--) {
            System.out.println("내림차순 : " + j);
        }
    }

}
