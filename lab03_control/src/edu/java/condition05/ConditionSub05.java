package edu.java.condition05;

//Ctrl+Shift+o: optimize import(import 문 최적화)
import java.util.Random;

public class ConditionSub05 {

    public static void main(String[] args) {
        Random random = new Random();

        int java = random.nextInt(101);
        int sql = random.nextInt(101);
        int jsp = random.nextInt(101);

        double avg = (double) (java + sql + jsp) / 3;
        String pass;

        if (java >= 40 && sql >= 40 && jsp >= 40 && avg >= 60) {
            pass = "합격";
        } else {
            pass = "불합격";
        }

        System.out.println("--------------------------");
        System.out.println("Java 점수: " + java);
        System.out.println("SQL 점수: " + sql);
        System.out.println("JSP 점수: " + jsp);
        System.out.println("점수의 평균: " + avg);
        System.out.println("합격 여부: " + pass);
        System.out.println("--------------------------");
    }

}
