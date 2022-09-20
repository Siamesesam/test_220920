package edu.java.array08;

import java.util.Random;

public class ArrayMain08 {

    public static void main(String[] args) {
        // Ch. 6-2 Ex. 5 (201p)
        /*
         * 1차원 정수(int) 배열 3개를 갖는 2차월 배열을 선언. 첫번쨰 배열에는 난수 2개, 두번째 배열에는 난수 3개, 세번째 배열에는 난수
         * 4개 저장. 난수의 범위는[70, 100). : 70이상 100미만
         */
        Random random = new Random();
        int[][] array = new int[3][];
        int sum = 0;
        double avg = 0;
        /*
         * array[0] = new int[2]; array[0] = new int[3]; array[0] = new int[4];
         */
        for (int i = 0; i < array.length; i++) {
            array[i] = new int[(i + 2)];
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(30) + 70;

            }

        }

        System.out.println();
        for (int[] score : array) {
            for (int a : score) {
                System.out.print(a + " ");
            }
            System.out.println();
        }
        int count =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                count++;
            }
        }
        /*
        for(int[] arr : array) {
            for(int x : arr) {
                sum += x;
            }
        }
         */

        avg = (double) sum / count;// (array[0].length + array[1].length + array[2].length);

        System.out.println();
        System.out.println("sum: " + sum);
        System.out.println("avg: " + avg);
    }

}
