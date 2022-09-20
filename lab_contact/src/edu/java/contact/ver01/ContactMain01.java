package edu.java.contact.ver01;

import java.util.Scanner; // 스캐너쓸라고 필요함 임포터

import edu.java.contact.menu.MainMenu;

public class ContactMain01 {
    // 상수
    private static final int MAX_LENGTH = 3; // 저장할 수 있는 연락처의 최대 개수.(배열길이)

    //    private Scanner scanner;
    //
    //    // 생성자
    //    public ContactMain01() { // static이 아닌 메서드를 사용하기위해 객체 생성. 
    //        scanner = new Scanner(System.in);
    //    }

    // 클래스 멤버 변수
    private Scanner scanner = new Scanner(System.in); // 입력 도구
    private Contact[] contacts = new Contact[MAX_LENGTH]; // 연락처들의 배열

    private int count = 0; // 배열에 저장된 연락처의 개수. 

    public static void main(String[] args) {

        System.out.println("***** 연락처 프로그램 Verstion 0.1 *****");

        // tec. static이 아닌 메서드를 호출하기 위한 

        ContactMain01 app = new ContactMain01(); // static이 붙지 않은 showMainMenu의 객체의 주소를 저장하기위한 스택영역에 app 이라는 변수를 클래스호출을 통해 만들어준다. 

        boolean run = true; // 프로그램을 계속 실행할 지, 종료할 지를 결정하기 위한 변수.

        while (run) {

            // TODO 1. 메인 메뉴 보여주기
            app.showMainMenu();

            // TODO 2. 메뉴 입력

            int n = Integer.parseInt(app.scanner.nextLine()); // 문자열을 입력받아 int 형태로 전환해주는 Integer.ParseInt를 사용해 변환 
            MainMenu menu = MainMenu.getValue(n);

            // TODO 3. switch-case

            switch (menu) {
            case SELECT_ALL: // 전체리스트
                app.selectAllContacts();
                break;
            case SELECT_BY_INDEX: // 인덱스검색
                app.selectContactByIndex();
                break;
            case CREATE: // 새연락처
                app.insertNewContact();
                break;
            case UPDATE: // 수정 
                app.updateContact();
                break;
            case QUIT:
                run = false;
                break;
            default:
                System.out.println("지원하지 않는 메뉴입니다. 다시 선택하세요.");
            }

        } // end while(run)
        System.out.println("***** 프로그램 종료 *****");

    } // end main

    /**
     * 수정할 인덱스 입력 수정 전 연락처 정보 출력 수정할 이름/전화번호/이메일 입력 연락처 정보 업데이트
     */
    private void updateContact() {
        // TODO: NullPointerException 또는 ArrayIndexOutOfBoundsException 발생할 수 있음.
        System.out.print("수정할 인덱스>> ");
        int index = Integer.parseInt(scanner.nextLine());
        if (index < 0 || index >= count) {
            System.out.println("잘못된 입력입니다 다시 검색해주세요.");
            return;
        }

        System.out.println("=수정 전=");
        contacts[index].printContact();

        System.out.print("수정할 이름>> ");
        String name = scanner.nextLine();
        System.out.print("수정할 번호>> ");
        String phone = scanner.nextLine();
        System.out.print("수정할 이메일>> ");
        String email = scanner.nextLine();

        contacts[index].setName(name);
        contacts[index].setPhone(phone);
        contacts[index].setEmail(email);

        System.out.println("=수정 후=");
        contacts[index].printContact();
    }

    /**
     * 검색할 인덱스
     */
    private void selectContactByIndex() {
        // TODO: NullPointerException 또는 ArrayIndexOutOfBoundsException 발생할 수 있음.
        System.out.print("검색할 인덱스>> ");
        int index = Integer.parseInt(this.scanner.nextLine());// updateContact라는 메서드를 호출하면서 객체가 생성되서 scanner를 사용할 수 있다.
        // 즉, 나를 불러 객체를 생성해 스캐너를 사용하는 것이기 때문에 this(나)를 부르는것이므로 this. 가 생략되어 있는거임.
        if (index < 0 || index >= count) {
            System.out.println("잘못된 입력입니다 다시 검색해주세요.");
            return;
        }
        contacts[index].printContact();
    }

    /**
     * 이름, 전화번호, 이메일 입력 Contact 객체 생성 배열에 추가
     */
    private void insertNewContact() {
        // TODO: ArrayIndexOutOfBoundsException 발생할 수 있음.
        if (count < MAX_LENGTH) {
            System.out.print("이름 입력>> ");
            String name = scanner.nextLine();

            System.out.print("전화번호 입력>> ");
            String phone = scanner.nextLine();

            System.out.print("이메일 입력>> ");
            String email = scanner.nextLine();

            Contact c = new Contact(name, phone, email);

            contacts[count] = c; // 여기
            count++;
        } else {
            System.out.println("잘못된 입력입니다 다시 검색해주세요.");
        }

    }

    /**
     * 
     */
    private void selectAllContacts() {
        // 배열 contacts에 저장된 Contatct 객체들을 출력. 
        System.out.println("--- 연락처 전체 리스트 ---");
        for (int i = 0; i < count; i++) {
            // 배열의 길이만큼 반복하는 것이 아니라, 배열에 실제로 저장된 연락처 개수만큼만 반복함. 
            contacts[i].printContact();
        }
        System.out.println("--------------------------------------------");
    }

    /**
     * 전체리스트 출력
     */
    private void showMainMenu() {
        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("[1]전체리스트 [2]인덱스검색 [3]새연락처 [4]수정 [0]종료");
        System.out.println("--------------------------------------------");
        System.out.print("메뉴 선택> ");
    }

} // end class
