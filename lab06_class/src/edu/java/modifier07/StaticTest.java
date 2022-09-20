package edu.java.modifier07;

public class StaticTest {
    int instanceVariable; // 인스턴스 변수
    static int staticVariable;
    
    public void printVariables() {
        System.out.println("--- instance method ---");
        System.out.println("인스턴스 변수 = " + instanceVariable);
        System.out.println("static 변수 = " + staticVariable);
    }
    
    public static void printVariables2() {
        System.out.println("--- static method ---");
        // System.out.println("인스턴스 변수 = " + instanceVariable); 
        // static 멤버는 static 메서드에서만 사용할 수 있다. 
        System.out.println("static 변수 = " + staticVariable);
    }
}
