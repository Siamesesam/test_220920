package edu.java.arrayHw;

import java.util.Scanner;

public class ArrayMainHw01 {

    public static void main(String[] args) {
        // 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서, 최고 점수 및 평균 점수를 구하는 프로그램입니다. 실행결과를 보고 알맞게
        // 작성해보세요.

        boolean run = true; // while 을 빠져나가기 위한 논리값 // 프로그램을 계속 실행할 지, 종료할 지를 결정하기 위한 변수.
        int studentNum = 0; // 학생수를 받을 변수 // 입력받은 학생수를 저장할 변수.
        int[] scores = null; // 점수를 받을 1차원 배열 // null: 배열이 만들어지지 않음.
        Scanner scanner = new Scanner(System.in); // 입력값을 받기 위한 Scanner 호출

        while (run) { // 프로그램 종료까지 반복
            System.out.println("--------------------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("--------------------------------------------");
            System.out.print("선택>> ");

            // 목록에 따른 입력값을 nextLine() 으로 받아 문자열을 숫자로 반환 *Intger.parseInt
            int selectNo = Integer.parseInt(scanner.nextLine()); // 콘솔창에서 문자열을 입력받아서 int로 변환.

            // switch 문 대채 가능
            if (selectNo == 1) { // 1번을 눌렀을 경우
                System.out.print("학생수> ");
                studentNum = Integer.parseInt(scanner.nextLine()); // nextLine() 으로 입력값을 받는다.
                scores = new int[studentNum]; // 새로운 객체를 생성해 입력받은 학생수의 배열을 생성 // 이거 쌉중요 이거때매 다 만들어놓고 엄청 헤맸음 이거 무조건 생각하셈;;
                // int[] scores = {0, 0, 0}; == scores = new int[3];// 입력받은 학생수 크기의 배열을 생성.
            } else if (selectNo == 2) { // 2번을 눌렀을 경우
                if (scores == null) {
                    System.out.println("학생수를 입력해주세요.");
                    continue; // while 반복문을 처음부터 다시 시작.
                }
                // 반복문을 통해 배열에 점수 입력
                for (int i = 0; i < scores.length; i++) { //
                    // System.out.print("scores[" + i + "]> ");
                    System.out.printf("scores[%d]> ", i); // 아니 이걸 왜 생각 못했지!!!!
                    scores[i] = Integer.parseInt(scanner.nextLine());
                    // System.out.println("scores[i]> " + scores[i]);
                }

            } else if (selectNo == 3) { // 3번을 눌렀을 경우
                if (scores == null) {
                    continue;
                }
                // 반복문으로 입력받은 점수 출력
                /*
                 * for (int i = 0; i < scores.length; i++) { System.out.println("scores[" + i +
                 * "]> " + scores[i]);
                 * 
                 * }
                 */
                int count = 0;
                for (int x : scores) {
                    System.out.println("socres[" + count + "]" + x);
                    count++;
                }

            } else if (selectNo == 4) { // 4번을 눌렀을 경우
                if (scores == null) {
                    System.out.println("학생수를 입력해주세요.");
                    continue;
                }
                int sum = 0; // 평균을 구하기 위한 합계 변수
                double avg; // 평균을 받기위한 변수
                int max = 0;// scores[0]; // 최대값을 받기 위한 변수, 첫번째값을 초기값으로 선언

                // 입력받은 점수중 최대값을 비교 후 저장.
                /*
                 * for (int i = 0; i < scores.length; i++) { if (max < scores[i]) { max =
                 * scores[i]; } }
                 */
                for (int x : scores) {
                    max = (x > max) ? x : max;
                }

                // 입력받은 점수를 누적해 합계 저장
                for (int i = 0; i < scores.length; i++) {
                    sum += scores[i];
                }
                /*
                 * for (int x : scores) { sum += x; }
                 */
                // 평균을 구하는 공식
                avg = (double) sum / studentNum;

                System.out.println("최고 점수: " + max); // 최대값 출력
                System.out.println("평균 점수: " + avg); // 평균 출력

            } else if (selectNo == 5) { // 5번 넣었을 경우
                run = false; // 5를 눌렀을 경우 run 에 false를 넣어 while문 탈출
            } else { // 그 외
                System.out.println("메뉴를 다시 선택해주세요.");
            }

        } // end while
        System.out.println("프로그램 종료"); // 프로그램 종료

    }

}
