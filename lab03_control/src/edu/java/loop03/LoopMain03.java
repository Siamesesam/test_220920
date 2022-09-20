package edu.java.loop03;

public class LoopMain03 {

    public static void main(String[] args) {
        // 아래와 같은 형식으로 구구단 2단을 출력하세요.
        // 2 ㅌ 1 = 2 .......... 2 ㅌ 9 = 18
        /*
        for (int i = 1; i < 10; i++) {
        //    System.out.println("2 x " + i + " = " + i * 2);
            System.out.printf("2 x %d = %d\n", i, (i * 2));
            
        } 
        
        for (int j = 1; j < 10; j++) {
            System.out.println("< " + j + "단 >");
            for (int k = 1; k < 10; k++) {
                System.out.println(j + " x " + k + " = " + j * k);
            }
        }
        
        */
        for (int i = 1; i <= 100; i++) {
            // if()
            // System.out.printf("%d   %d   %d   %d   %d   %d   %d   %d   %d   %d\n", i);
            
            System.out.printf("%d\t",i);
            if (i % 10 == 0) {
                System.out.print("\n");
            }
           
        }
    }

}
