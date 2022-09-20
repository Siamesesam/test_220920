package edu.java.inheritance02;

// 학생은 사람이다. ->Person: Superclass, Student: Subclass
public class Student extends Person {
    // field
    private String school;

    // constructor
    public Student() {
        super(); // 부모클래스(super class)에 기본생성자를 호출하겠다는 코드가 생략되어 있다! (생략 가능) 
        System.out.println("Student() 생성자 호출");
    }

    public Student(String school) {
        // super();
        // superclass의 생성자를 명시적으로 호출하지 않은 경우에는 "기본 생성자"가 자동으로 호출된다. 
        this.school = school;
        System.out.println("Student(school) 생성자 호출");
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
        System.out.println("Student(name, school) 생성자 호출");
    }

    // getter/setter
    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

}
