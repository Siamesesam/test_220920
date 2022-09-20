package edu.java.string01;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args) {
        // String 클래스의 메서드들을 사용

        // ex-1. 아래의 주민번호 문자열에서 성별을 표시하는 위치의 문자만 출력.
        String ssn = "991221-1234567";
        printGender(ssn);

        System.out.println("------------------------------");
        // ex-2. 아래의 문자열 배열에서 "홍길동"의 인덱스를 출력. 
        String[] names = { "오썜", "홍길동", "John", "Jane" }; // 
        System.out.println(Arrays.binarySearch(names, "홍길동"));
        System.out.println();
        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals("홍길동")) {
                index = i;
                break;
            }
        }
        System.out.println(index);

        System.out.println("------------------------------");
        // ex-3. 아래의 문자열 배열에서 5글자 이상인 문자열들만 출력
        String[] languages = { "Java", "SQL", "JavaScript", "Pyton" };
        printFiveWordString(languages);
        System.out.println();
        for (String s : languages) {
            if (s.length() >= 5) {
                System.out.print(s + ", ");
            }
        }
        System.out.println();

        System.out.println("------------------------------");
        // ex-4. 아래의 문자열 배열에서 대소문자 구별없이 "est"를 포함하는 문자열들을 출력.
        String[] tests = { "TEST", "test", "TeSt", "tEsT", "테스트" };
        for (String s : tests) {
            if (s.toLowerCase().contains("est")) { // 소문자 변형, 포함하고 있느냐 없느냐
                System.out.print(s + ", ");
            }
        }

        System.out.println("------------------------------");
        // ex-5. 아래의 "YYYY-MM-DD" 형식의 날짜 문자열에서 년/월/일 정보를 int 타입 변수에 저장하고 출력.
        String date = "2022-09-07";
        String[] array = date.split("-"); // -> {"2022", "09", "07"}; // 패턴을 기준으로 문자열을 자르는기능 split()
        //        System.out.println(array[0] + "-" + array[1] + "-" + array[2]);
        int year = Integer.parseInt(array[0]);
        int month = Integer.parseInt(array[1]);
        int day = Integer.parseInt(array[2]);
        System.out.println(year + "-" + month + "-" + day);
    }

    private static void printFiveWordString(String[] languages) {
        for (int i = 0; i < languages.length; i++) {

            if (languages[i].length() >= 5) {
                System.out.println(languages[i]);
            }
        }
    }

    private static void printGender(String ssn) {
        char c = ssn.charAt(ssn.length() - 7);

        if (c == '1' || c == '3') {
            System.out.println(c);
            System.out.println("남자");
        } else {
            System.out.println(c);
            System.out.println("여자");
        }

    }
}
