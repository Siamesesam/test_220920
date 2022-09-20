package edu.java.exception04;

public class ExceptionMain04 {

    public static void main(String[] args) {
        // finally 블로:
        // 예외 발생 여무봐 상관없이 try 블록이 끝나거나 또는 catch 블록이 끝났을 때 항상 실행하는 블록. 
        // (주의) try 블록 또는 catch 블록 안에 return

        try {
            int x = 100;
            int y = 0;
            System.out.println("몫 = " + (x / y));
            System.out.println("end try");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("end catch");
            return;
        } finally {
            System.out.println("언제 출력될까요?");
        }
        System.out.println("end main");
    }
}
