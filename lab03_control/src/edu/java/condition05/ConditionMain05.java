package edu.java.condition05;

import java.util.Random;

public class ConditionMain05 {

    public static void main(String[] args) {
        /*
         * Random 타입 변수를 선언하고, 초기화 Java 과목의 점수를 0 이상 100 이하의 난수를 만들어서 저장. SQL 과목의 점수를 0
         * 이상 100 이하의 난수를 만들어서 저장. JSP 과목의 점수를 0 이상 100 이하의 난수를 만들어서 저장. 세 과목의 평균을 계산.
         * 모든 과목의 점수가 40점 이상이고, 평균이 60 점 이상이면, " 합격", 그렇지 않으면 " 불합격" 출력
         */

        Random random = new Random();

        
        int java = random.nextInt(101);
        int sql = random.nextInt(101);
        int jsp = random.nextInt(101);

        int y = 1;
        int n = 0;
        int avg = (java + sql + jsp) / 3;
        String whether;

        int pass = (java >= 40) ? ((sql >= 40) ? ((jsp >= 40) ? y : n) : n) : n;

        if (pass == 1) {
            if (avg >= 60) {
                whether = "합격";
            } else {
                whether = "불합격";

            }
            
        } else {
            whether = "불합격";
            
        }
        System.out.println("--------------------------");
        System.out.println("Java 점수 :" + java);
        System.out.println("SQL 점수 :" + sql);
        System.out.println("JSP 점수 :" + jsp);
        System.out.println("점수의 평균 : " + avg);
        System.out.println("합격 여부 : " + whether);
        System.out.println("--------------------------");
    }
}
