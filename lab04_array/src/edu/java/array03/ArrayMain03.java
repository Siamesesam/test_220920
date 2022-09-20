package edu.java.array03;

import java.util.Random;

public class ArrayMain03 {

    public static void main(String[] args) {
        /*
         * Random 객체를 선언, 생성. 정수 10개를 저장할 수 있는 배열(scores)을 선언. 배열 scores에 0 이상 10이하의 정수
         * 10개를 저장. 배열 scores에 저장된 모든 점수들의 합계를 계산하고 출력. 배열 scoresㅇ에 저장된 모든 점수들의 평균을
         * 소수점까지 계산해서 출력.
         */

        Random random = new Random();
        int sum = 0;
        int[] scores = new int[10];
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

    }

}
