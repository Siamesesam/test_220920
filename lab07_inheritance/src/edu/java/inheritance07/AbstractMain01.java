package edu.java.inheritance07;

// 추상 메서드(abstract method)
// signature(수식어, 리턴 타입, 파라미터) 만 선언되어 있고, 본체({...})가 정의되지 않은
// 추상 메서드는 반드시 abstract 수식어를 사용해야 함.
// 추상 메서드의 선언은 반드시 세미콜론(;)으로 끝나야함.

// 추상 클래스(abstract class)
// abstract 수식어가 상ㅇ된 클래스.
// 대부분의 경우, 추상 클래스는 1개 이상의 추상 메서드를 가지고 있음.
// 추상 메서드를 가지고 있는 경우에는 클래스 선언에서 반드시 abstract를 사용해야 함.

// 추상 메서드와 추상 클래스는 상속하는 하위 클래스에서 구현을 목적으로 함. 

abstract class Animal {
    public abstract void move();
}

class Dog extends Animal {
    @Override // 추상 메서드를 재정의해서 메서드 본체를 작성 -> 구현(implement)
    public void move() {
        System.out.println("강자이가 총총총...");
    }
}

class Fish extends Animal {
    @Override
    public void move() {
        System.out.println("물고기는 헤엄헤엄 ~^^");
    }
}

class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("새를 훨훨~~~~");
    }

}

public class AbstractMain01 {
    public static void main(String[] args) {
        Animal dog = new Dog(); // 다형성
        dog.move();
        
        Fish fish = new Fish();
        fish.move();
        
        Animal bird = new Bird();
        bird.move();
        
        Animal[] animals = {dog, fish, bird};
        for(Animal a : animals) {
            a.move();
        }
        
    } // end main
} // end AbstractMain01
