package edu.java.list03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListMain03 {

    public static void main(String[] args) {
        List<String> languages = Arrays.asList("Java", "SQL", "HTML", "CSS", "JavaScript", "Servlet", "JSP", "Spring",
                "Python");
        System.out.println(languages);
        System.out.println();

        // 리스트 languages에서 5글자 이상인 문자열들만 저장하는 리스트를 생성, 출력
        ArrayList<String> longWords = new ArrayList<>();

        for (String a : languages) {
            if (a.length() >= 5) {
                longWords.add(a);
                // System.out.print(a + ", ");
            }
        }
        System.out.println(longWords);
        System.out.println();

        // Iterator<E> 사용:
//        List<String> longWords2 = new ArrayList<>();
//        Iterator<String> itr = languages.iterator();
//        while (itr.hasNext()) {
//            String s = itr.next();
//            if (s.length() >= 5) {
//                longWords2.add(s);
//            }
//        }
//        System.out.println(longWords);
        
        // 리스트 languages의 원소들의 글자수를 저장하는 리스트를 만들고 출력.
        ArrayList<Integer> wordsLe = new ArrayList<>();

        for (String x : languages) {
            int len = x.length();
            wordsLe.add(len);
        }

        System.out.println(wordsLe);

        // 정수(1, 2)들을 저장하는 리스트를 만들고 초기화.
        List<Integer> genderCodes = Arrays.asList(1, 1, 2, 2, 1, 2, 2);
        System.out.println();

        // 리스트 genderCodes의 원소가 1이면 "Male", 2이면 "Female"을 저장하는 리스트를 만들고 출력.
        ArrayList<String> sex = new ArrayList<>();
        for (int i = 0; i < genderCodes.size(); i++) {
            Integer s = genderCodes.get(i);
            if (s == 1) {
                sex.add("Male");
            } else if (s == 2) {
                sex.add("Female");
            }
        }

        //        for (Integer code : genderCodes) {
        //            String gender = "";
        //            if (code == 1) {
        //                gender = "Male";
        //
        //            } else {
        //                gender = "Female";
        //
        //            }
        //        }
        // genders.add(gender);
        //        genders.add((code == 1) ? "Male" : "Female" );

        System.out.println(sex);
    }

}
