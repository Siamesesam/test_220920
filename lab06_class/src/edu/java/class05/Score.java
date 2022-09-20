package edu.java.class05;

public class Score {
    // field
    int korean; // 국어
    int english; // 영어
    int math; // 수학

    //    String korean;
    //    String english;
    //    String math;

    // constructor - 기본 생성자, argument를 갖는 생성자
    public Score() {
        // default constructor
    }

    //    public Score(String korean, String english, String math) {
    //      this.korean = korean;
    //      this.english = english;
    //      this.math = math;
    //  }
    public Score(int korean, int english, int math) {
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    // 세 과목의 점수를 출력하는 메서드.
    public void scores() {
        System.out.println("국어: " + korean);
        System.out.println("영어: " + english);
        System.out.println("수학: " + math);

    }

    // 세 과목의 총점을 리턴하는 메서드. /8
    public int sum() {
        return korean + english + math;
    }

    // 세 과목의 평균(소수점까지 계산)을 리턴하는 메서드.
    public double avg() {
        return sum() / 3.0;
    }

}
