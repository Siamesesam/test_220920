package edu.java.class05;

public class Student {
    // field
    int stuNum; // 학번(학생 아이디)
    String stuName = null; // 학생이름
    Score score; // = new Score(); // 국어/ 영어/ 수학 점수

    // constructor
    // (1) 기본 생성자
    public Student() {

    }

    // (2) argument: int, String, Score
    public Student(int stuNum, String stuName, Score score) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.score = score;
    }

    // (2) argument: int, String, int, int, int
    public Student(int stuNum, String stuName, int korean, int english, int math) {
        /*
        this.stuNum = stuNum;
        this.stuName = stuName;
        Score score = new Score(korean, english, math);
        // stu2.score = score2;
        this.score = score;
        */
        this(stuNum, stuName, new Score(korean, english, math));
    }

    // method - 학생 정보(학번, 이름, 국/영/수 과목 점수, 총점, 평균)를 출력. 
    public void print() {
        System.out.println("== 학생 정보 ==");
        System.out.println("학번: " + this.stuNum);
        System.out.println("이름: " + this.stuName);
        // this.score.scores();
        if (this.score != null) {
            this.score.scores();
            System.out.println("총점: " + this.score.sum());
            System.out.println("평균: " + this.score.avg());
        } else {
            System.out.println("점수: null");
        }
        //        System.out.println("총점: " + score.sum());
        //        System.out.println("평균: " + score.avg());
    }

}
