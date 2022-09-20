package edu.java.list04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ListMain04 {

    public static void main(String[] args) {
        // User 타입 객체 선언, 생성, 출력.
        // User 객체 콘솔 출력 값이 toString() 메서드 Override 전/후에 어떻게 달라지는 지 확인.
        User user1 = new User();
        System.out.println(user1);
        System.out.println(user1.getUserId());

        User user2 = new User("abcd", "efgh");
        System.out.println(user2);
        System.out.println(user2.getPassword());
        user2.setPassword(null);
        System.out.println(user2);
        System.out.println();

        // User 타입을 저장할 수 있는 ArrayList를 선언, 생성.
        ArrayList<User> userList = new ArrayList<>();

        // for 문장을 사용(3번 반복). Scanner를 사용.
        // 콘솔창에서 입력받은 아이디와 비밀번호로 User 객체를 생성하고 리스트에 추가.
        // 리스트를 출력
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.printf("반복[%d]\n", i);
            System.out.print("아이디 입력>> ");
            String id = sc.nextLine();
            System.out.print("비밀번호 입력>> ");
            String pwd = sc.nextLine();

            User user = new User(id, pwd);

            userList.add(user);

        }
        System.out.println();
        System.out.println("<콘솔창에서 입력받은 User>");
        System.out.println(userList);

        // 리스트 userList에서 인덱스 1인 원소를 삭제, 리스트를 출력.
//        userList.remove(1);
//        System.out.println(userList);

        // 리스트에서 userId가 "guest"인 User 객체를 삭제, 리스트를 출력.
        for (int i = 0; i < userList.size(); i++) {
            // 두 개의 문자열이 같은 지 비교할 때는 "반드시" equals() 메서드를 사용!
            if (userList.get(i).getUserId().equals("guest")) {
                userList.remove(i);
                // i--;
                break;
            }
        }

        System.out.println(userList);

        // 2) userId가 "guest"인 User 객체를 삭제, 리스트를 출력.
//        for (User u : userList) {
//            if (u.getUserId().equals("guest")) {
//                userList.remove(u);
//                break;
//            }
//        }
//        System.out.println(userList);
        
        System.out.println();
        
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("guest", ""));
        list.add(new User("guest1", ""));
        list.add(new User("guest", ""));
        list.add(new User("guest2", ""));
        
        List<User> toDelete = Arrays.asList(new User("guest", null));
        list.removeAll(toDelete);
        System.out.println(list);
    }

}
