package edu.java.singleton01;

// 싱글톤(singleton): 객체가 오직 한 번만 생성될 수 있도록 
// singleton = (1) private static field + (2) private constructor + (3) public static method

public class Captain {
    // (1) private static field 
    private static Captain instance = null; // 정적메서드 영역에 instance라는 변수를 null 상태로 저장.  

    private String name = "캡틴 아케리카"; // 스택영역에 name이라는 변수는 있지만 힙영역에 객체는 생성되지않은 상태 

    // (2) private 생성자 
    // -> 다른 클래스에서 생성자가 안 보임. -> 다른 클래스에서는 객체를 생성할 수 없음.
    private Captain() {
        // default constructor
    }

    // (3) public static Captain 타입을 리턴하는 메서드
    public static Captain getInstance() {
        if (instance == null) { // 
            instance = new Captain();
        }

        return instance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
