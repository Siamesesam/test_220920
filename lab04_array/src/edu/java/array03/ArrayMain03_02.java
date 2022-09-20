package edu.java.array03;

import java.util.Random;

public class ArrayMain03_02 {

    public static void main(String[] args) {
        
        Random random = new Random();
        int sum = 0;
        int[] scores = new int[10];
        /*
        System.out.print("배열에 저장된 난수 : ");
        
        for (int i = 0; i < scores.length; i++) {
            int score = random.nextInt(11);
            scores[i] = score;
            sum += scores[i];
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.print("배열에 저장된 난수 확인 : ");
        for (int m : scores) {

            System.out.print(+m + " ");
        }
        double avg = sum / 10.0;

        System.out.println();
        System.out.println("배열 scores에 저장된 모든 점수의 합계 : " + sum);
        System.out.println("배열 scores에 저장된 모든 점수의 평균 : " + avg);
        */
        System.out.print("배열에 저장된 난수 : ");
        int i = 0;
        while(i < scores.length) {
            scores[i] = random.nextInt(11);
            sum += scores[i];
            System.out.print(scores[i] + " ");
            i++;
        }
        double avg = (double)sum / scores.length;
        System.out.println();
        System.out.println("배열 scores에 저장된 모든 점수의 합계 : " + sum);
        System.out.println("배열 scores에 저장된 모든 점수의 평균 : " + avg);
        
        /*
         for ( int m : scores) {
         sum += m;
         }
         이런 방법도 있었노 어짜피 본집에서 몇번쨰라고 해서 가져오는거니까
         
         */
        
        
        
    }

}