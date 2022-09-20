package edu.java.inheritance01;

// 상속(inheritance)
// super class(상위 클래스), parent class(부모 클래스), base class(기본 클래스)
// sub class(하위 클래스), child class(자식 클래스), derived class(유도 클래스)
// class SubClass extends SuperClass { ... }

public class IngeritanceMain01 {

    public static void main(String[] args) {
        BasicTv tv1 = new BasicTv();
        tv1.powerOnOff();
        tv1.powerOnOff();
        
        System.out.println();
        
        // SmartTv 타입의 객체 생성.
        SmartTv tv2 = new SmartTv();
        tv2.powerOnOff();
        tv2.powerOnOff();
        tv2.setIp("123456789");
        System.out.println(tv2.getIp());
    }

}
