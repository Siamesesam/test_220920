package edu.java.interface02;

// 인터페이스가 가질 수 있는 멤버들 = Java 8 버전 이후의 변경.
// 1. [public static final] 필드(멤버 변수) 
// 2. [public abstract] 메서드: body가 없는 추상 메서드.
// 3. [public] default 메서드: body({...})가 구현된 메서드. Java 8 버전 부터.
//      -> 인터페이를 구혀하는(하위) 클래스의 객를 생성한 후에 참조 변 수를 이용해서 호룰(사용) 하는 메서드     
// 4. [public] static 메서드: body가 구현된 static 메서드. Java 8 버전 부터.
//      -> 객체 생성 없이 인터페이스 이름으로 참조해서 호출(사용)하는 method.
// 5. private static 메서드: body가 구혀된 static 메서드. Java 9 버번부터.
//      -> 인터페이스의 [public] static 메서드 안에서만 사용하기 위한 목적의 메서드.
// 6. private 메서드: body가 구현된 메서드. Java 9 버전부터
//      -> 인터페이스의 [public] default 메서드 안에서만 사용하기 위한 목적의 메서드.

interface Test {
    // 1. [public static final] field
    int VERSION = 1;

    // 2. [public abstract] method
    void test();

    // 3. [public] default method - java 8 ~
    default void defaultMethod() {
        System.out.println("공개 default 메서드");
        privateStaticMethod();
        privateMethod();
    }

    // 4. [public] static method - Java 8 ~ 
    static void staticMethod() {
        System.out.println("공개 static 메서드");
    }

    // 5. private static method - Java 9 ~
    private static void privateStaticMethod() {
        System.out.println("비공개 static 메서드");
    }

    // 6. private method - Java 9 ~ 
    private void privateMethod() {
        System.out.println("비공개 이미 구현된 메서드");
    }

} // end interface Test

class TestImpl implements Test {

    @Override
    public void test() {
        System.out.println("test 구현 메서드");

    }

} // end TestImpl

public class InterfaceMain02 {

    public static void main(String[] args) {
        // 인터페이스의 [public] static 멤버 사용
        System.out.println(Test.VERSION);
        Test.staticMethod();

        System.out.println();
        // 인터페이스의 [public] default 멤버 사용
        Test test = new TestImpl();
        test.defaultMethod();

        System.out.println();

        // 인터페이스의 [public abstract] 메서드 사용 - 구현된 메서드가 있어야.
        test.test();

    } // end main

} // end InterfaceMain02











