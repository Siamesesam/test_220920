package edu.java.inheritance02;

public class Person {
    // field
    private String name;
    
    // constructor
    public Person () {
        System.out.println("Person() 생성자 호풀.");
    }
    
    public Person (String name) {
        this.name = name;
        System.out.println("Person(String name) 생성자 호풀.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
