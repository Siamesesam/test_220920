package edu.java.loop05;

public class LoopMain05 {

    public static void main(String[] args) {
        // RPS 게임 
        for (int i = 1; i <= 100; i++) {

            // System.out.printf("%d\t",i);
            if ((i % 10 == 3 || i % 10 == 6 || i % 10 == 9) && (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
                String star = "**"; // 문자열에 별표시
                System.out.print(star + "\t"); // 텝 추가

                if (i % 10 == 0) { // 십의 자리마다 줄바꿈
                    System.out.print("\n");
                }
                continue; // 줄바꿈이 잘 되게끔 컨티뉴문
            }
            
            if ((i % 10 == 3 || i % 10 == 6 || i % 10 == 9) || (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
                // or 연산자는 하나라도 true 면 true 이므로 i 를 10으로 나웠을때 나머지가 3, 6, 9 일때의 경우로 일의 자리가 3, 6,
                // 9 일 경우를 조건을 달아주고, 몫이 3, 6, 9로 떨어지는 십의 자리의 조건을 달아줌으로써
                // 모든 3, 6, 9가 들어가는 숫자를 찾아낸다.
                String star = "*"; // 문자열에 별표시
                System.out.print(star + "\t"); // 텝 추가

                if (i % 10 == 0) { // 십의 자리마다 줄바꿈
                    System.out.print("\n");
                }
                continue; // 줄바꿈이 잘 되게끔 컨티뉴문
            }
            /*
             * if (i % 30 == 1 || i % 30 == 1 || i % 30 == 1) { String star = "*";
             * System.out.print(star + "\t"); }
             */
            System.out.printf("%d\t", i);

            if (i % 10 == 0) {
                System.out.print("\n");
            }

        }
    }

}
