package edu.java.array05;

public class ArrayMain05 {

    public static void main(String[] args) {
        // 문자열 1차월 배열
        String[] bts = { "정국", "뷔", "RM", "슈가", "제이홉", "진", "지민" };
        String[] newJeans = { "민지", "하니", "다니엘", "해린", "혜인" };

        // 문자열 2차월 배열
        String[][] idols = { bts, newJeans };

        System.out.println(idols[0].length);
        System.out.println(bts.length);
        System.out.println(newJeans.length);
        // for 문을 사용해서 idols 멤버들을 출력
        for (int i = 0; i < idols.length; i++) {
            for (int j = 0; j < idols[i].length; j++) {
                System.out.print(idols[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");
        // for-each문을 사용해서 idols 멤버들을 출력
        for (String[] group : idols) {
            for (String member : group) {

                System.out.print(member + "\t");
            }
            System.out.println();
        }
        /*
         * int[] numbers = { 1, 3, 5, 7, 9 }; for (int i = 0; i < numbers.length; i++) {
         * System.out.println(numbers[i]); }
         */
    }

}