package edu.java.set03;

import java.util.HashSet;
import java.util.Random;

public class SetMain03 {

    public static void main(String[] args) {
        //        // HashSet<E> 사용. [0, 10) 범위의 정수 난수 5개를 저장. Set의 내용을 출력.
        HashSet<E> set = new HashSet<>();

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            E x = new E(random.nextInt(10));
            set.add(x);
        }

        //        HashSet<Integer> set = new HashSet<>();
        //
        //        Random random = new Random();
        //
        //        while (set.size() < 5) {
        //            set.add(random.nextInt(10));
        //
        //        }
        System.out.println(set);
    }

}
