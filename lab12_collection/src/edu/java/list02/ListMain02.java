package edu.java.list02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public class ListMain02 {

    public static void main(String[] args) {
        // 1. 정수를 저장하는 LinkedList 객체 선언/생성.
        LinkedList<Integer> numbers = new LinkedList<>();
        // 2. 리스트에 [0, 100) 범위의 정수 난수 20개를 저장.
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(100));
        }
        // 3. 난수가 저장된 리스트(numbers)를 출력.
        System.out.println("** 0이상 100미만의 정수 난수 **");
        System.out.println(numbers);
        System.out.println();
        // 4. 홀수들만 저장하는 LinkedList 변수(odds) 선언, 객체 생성.
        LinkedList<Integer> odds = new LinkedList<>();
        // 5. 난수들이 저장된 리스트(numbers)에서 홀수들만 리스트(odds)저장.
        for (Integer num : numbers) {
            if (num % 2 == 1) {
                odds.add(num);
            }
        }
        // 6. 리스트 odds를 출력.
        System.out.println("** 리스트(numbers)에서 홀수들만 저장한 리스트(odds) **");
        System.out.println(odds);
        System.out.println();
        // 7. 짝수 제곱들을 저장하는 LinkedList 변수(evenSquares) 선언, 객체 생성.
        LinkedList<Integer> evenSquares = new LinkedList<>();
        // 8. 난수들이 저장된 리스트 numbers에서 짝수들을 찾아서 그 제곱을 evenSquares에 저장.
        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenSquares.add(num * num);
            }
        }

        //        for (int i = 0; i < numbers.size(); i++) {
        //            Integer x = numbers.get(i); // get이 Integer를 리턴하므로 타입을 Integer로 선언해 준다.
        //            if (x % 2 == 0) {
        //                evenSquares.add(x * x);
        //            }
        //        }

        Iterator<Integer> evenSquares2 = numbers.iterator();
        while (evenSquares2.hasNext()) {
            Integer x = evenSquares2.next(); // int x = evenSquares2.next(); // int <-- Integer auto-unboxing
            if (x % 2 == 0) {
                // System.out.print(Math.pow(x, 2));
                System.out.print(x * x + ", ");
            }
        }

        System.out.println();
        // 9. 리스트 evenSquares를 출력.
        System.out.println("** 리스트(numbers)에서 짝수들을 찾아서 그 제곱을 저장한 리스트(evenSquares) **");
        System.out.println(evenSquares);

        // Iterator<E>
        Iterator<Integer> itr = evenSquares.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + ", ");
        }

    }

}
