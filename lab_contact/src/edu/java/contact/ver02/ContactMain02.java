package edu.java.contact.ver02;

import edu.java.contact.menu.MainMenu;
import java.util.Scanner;

// MVC 아키텍쳐에서 View(UI)에 해당하는 클래스
public class ContactMain02 {

    private Scanner scanner = new Scanner(System.in);
    private ContactDaoImpl dao = ContactDaoImpl.getInstance(); // 컨트롤러(연락처 저장, 검색, 수정) 클래스

    public static void main(String[] args) {
        System.out.println("***** 연락처 프로그램 Version 0.2 *****");

        // static 이 아닌 메서드들을 호출하기 위해서 객체를 생성할 필요가 있음. 
        ContactMain02 app = new ContactMain02();

        boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정하기 위한 변수.
        while (run) {

            // 메인 메뉴 선택
            int n = app.showMainMenu();
            // 메인 메뉴 숫자를 enum MainMenu 타입으로 변환.
            MainMenu menu = MainMenu.getValue(n);
            switch (menu) {
            case QUIT: // 종료
                run = false;
                break;
            case SELECT_ALL: // 전체리스트
                app.selectAllContacts();
                break;
            case SELECT_BY_INDEX: // 인덱스검색
                app.selectContactByIndex();
                break;
            case CREATE: // 새연락처 추가
                app.insertNewContact();
                break;
            case UPDATE: // 연락처 정보 수정
                app.updateContact();
                break;
            //          default: 
            //              System.out.println("지원하지 않는 메뉴입니다. 다시 선택하세요.");
            case UNKNOWN:
                System.out.println("지원하지 않는 메뉴입니다. 다시 선택하세요.");
            } // end switch

        } // end while

        System.out.println("프로그램 종료");
    } // end main

    /**
     * 연락처 정보 수정.
     */
    private void updateContact() {
        System.out.print("업데이트 인덱스>> ");
        int index = Integer.parseInt(scanner.nextLine());
        if (dao.read(index) == null) {
            System.out.println("없는 연락처 입니다.");
            return;
        }
        System.out.print("변경할 이름>> ");
        String name = scanner.nextLine();
        System.out.print("변경할 전화번호>> ");
        String phone = scanner.nextLine();
        System.out.print("변경할 이메일>> ");
        String email = scanner.nextLine();
        // dao.update(index, name, phone, email);

        int result = dao.update(index, name, phone, email);
        if (result == 1) {
            System.out.println("연락처 업데이트 성공");
        } else {
            System.out.println("연락처 업데이트 실패");
        }
    }

    /**
     * 새연락처 추가
     */
    private void insertNewContact() {
        //      Contact contacts = new Contact();
        //      dao.create(contacts);
        //      System.out.print("이름>> ");
        //      contacts.setName(scanner.nextLine());
        //      System.out.print("전화번호>> ");
        //      contacts.setPhone(scanner.nextLine());
        //      System.out.print("이메일>> ");
        //      contacts.setEmail(scanner.nextLine());
        // 내일가서 새로운 객체를 생성해서 기본 null값을 setter 메서드로 변경해줘도 상관없는지 여쭤보기
        // 물론 굳이 필요없긴 하겠지만 이러한 경우도 있는지 여쭤보기 혹시 문제가 생길지도 모르니까

        System.out.println("---------- 연락처 등록 ----------");
        // count가 private로 되어있어서
        if (dao.getCount() == ContactDaoImpl.MAX_LENGTH) {
            System.out.println("연락처를 저장할 메모리가 부족합니다.");
            return;
        }
        System.out.print("이름>> ");
        String name = scanner.nextLine();
        System.out.print("전화번호>> ");
        String phone = scanner.nextLine();
        System.out.print("이메일>> ");
        String email = scanner.nextLine();

        Contact c = new Contact(name, phone, email);
        // Contact 타입 객체를 배열 저장 -> Controller 객체를 이용
        int result = dao.create(c);
        if (result == 1) {
            System.out.println("연락처 생성/저장 성공");
        } else {
            System.out.println("연락처 생성/저장 실패");
        }
    }

    /**
     * 인덱스로 검색해 연락처 출력
     */
    private void selectContactByIndex() {
        System.out.print("검색할 인덱스>> ");
        int index = Integer.parseInt(scanner.nextLine());
        if (dao.read(index) == null) {
            System.out.println("없는 연락처 입니다.");
            return;
        }
        System.out.println(dao.read(index));
    }

    /**
     * 전체 리스트 출력
     */
    private void selectAllContacts() {
        Contact[] contacts = dao.read();
        System.out.println("----------------- 연락처 -----------------");
        for (Contact c : contacts) {
            System.out.println(c);
        }
        System.out.println("----------------------------------------");
    }

    /**
     * 메인 UI, 메뉴 선택
     * 
     * @return
     */
    private int showMainMenu() {
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println("[1]전체리스트 [2]인덱스검색 [3]새연락처 [4]수정 [0]종료");
        System.out.println("----------------------------------------------------");
        System.out.print("메뉴 선택> ");

        int n = Integer.parseInt(scanner.nextLine());
        return n;

    } // end chooseMenu

} // end ContactMain
