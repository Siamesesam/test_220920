package edu.java.array07;

import java.util.Random;

public class ArrayMain07 {

    public static void main(String[] args) {
        // Chapter 6-2 Ex. 4
        // 정수(int) 10개를 저장하는 배열(array)을 선언

        // 배열에 0이상 10이하의(0 ~ 10) 정수 난수 10개를 저장.

        // 배열에서 최댓값을 찾으세요.
        // max = array[0] 가정
        // for (array의 모든 원소들)
        /*
         * for (array의 모든 숸소들) : if (max < array 원소) : max = array 원소
         */
        Random random = new Random(); // 난수 발생

        int[] array = new int[10]; // 개수가 10개인 배열 생성
        System.out.print("배열에 저장된 난수 : ");
        // for문을 통해 10개의 난수를 차례대로 배열에 저장
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(11);
        }
        // 난수가 저장된 배열 출력해서 확인
        for (int a : array) { // 배열에 있는 원소를 순서대로 a 에 저장
            System.out.print(a + " "); // 원소 출력
        }
        System.out.println(); // 줄바꿈
        System.out.print("max에 누적된 최댓값 : "); // 최대값이 어떻게 누적되면서 바뀌는지 확인하기 위해 누적된 값을 출력해 확인한다.
        int max = array[0]; // max에 배열 첫번째 값을 저장
        // max의 값을 차례대로 비교반복하면서 max 보다 큰 조건이면 그 값을 max 다시 저장한다.
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) { // i번째 원소가 max 보다 클경우
                max = array[i]; // max에 새로운 최대값 저장.
            }
            System.out.print(max + " "); // 누적된 최대값 출력
        }

        /*
         * for (int x : array) { if ( max < x ) { max = x; } } // max = (max < x) ? x :
         * max;
         */
        System.out.println();
        System.out.println("max : " + max); // 최종 최대값 출력

    }

}
