package edu.java.contact.ver03;

import java.util.Scanner;
import edu.java.contact.menu.MainMenu;
import edu.java.contact.ver02.Contact;

public class ContactMain03 {

	private Scanner sc = new Scanner(System.in); // Scanner 입력 도구 생성.
	private ContactDaoImpl dao = ContactDaoImpl.getInstance(); // singleton객체를 가져와 객체 생성.

	public static void main(String[] args) {
		System.out.println("***** 연락처 프로그램 Version 0.3 *****");

		// static이 아닌 메서드를 호출하귀한 객체생성.
		ContactMain03 app = new ContactMain03();

		boolean run = true; // while문 변수.
		while (run) {
		    // 메인 메뉴
			int n = app.showMainMenu();
			// enum함수 
			MainMenu menu = MainMenu.getValue(n);

			switch (menu) {
			case QUIT:
				run = false;
			case SELECT_ALL:
				app.selectAllContacts();
				break;
			case SELECT_BY_INDEX:
				app.selectContactByIndex();
				break;
			case CREATE:
				app.insertNewContact();
				break;
			case UPDATE:
				app.updateContact();
				break;
			case DELETE:
				app.deleteContact();
				break;
			case UNKNOWN:
				System.out.println("지원하지 않는 메뉴입니다. 다시 선택해주세요.");
			} // end switch

		} // end while

		System.out.println("** 프로그램 종료 **");

	} // end main

	private void deleteContact() {

		while (true) {
			// if () {
			try {
				System.out.print("삭제할 인덱스>> ");
				int index = Integer.parseInt(sc.nextLine());
				if (!dao.isValidIndex(index)) {
					System.out.println("해당 인덱스에는 연락처 정보가 없습니다.");
					return;
				}
				dao.delete(index);
				return;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 인덱스를 입력해주세요.");
				System.out.println();
			}
			// }
		}
	} // end deleteContact

	private void updateContact() {
		while (true) {
			try {
				System.out.print("업데이트 인덱스>> ");
				int index = Integer.parseInt(sc.nextLine());
				if (!dao.isValidIndex(index)) {
					System.out.println("해당 인덱스에는 연락처 정보가 없습니다.");
					return;
				}
				System.out.print("변경할 이름>> ");
				String name = sc.nextLine();
				System.out.print("변경할 전화번호>> ");
				String phone = sc.nextLine();
				System.out.print("변경할 이메일>> ");
				String email = sc.nextLine();
				Contact c = new Contact(name, phone, email);

				dao.update(index, c);
				return;

			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 인덱스를 입력해주세요.");
				System.out.println();
			}
		}
	} // end updateContact

	private void insertNewContact() {
		System.out.print("이름>> ");
		String name = sc.nextLine();
		System.out.print("전화번호>> ");
		String phone = sc.nextLine();
		System.out.print("이메일>> ");
		String email = sc.nextLine();
		Contact c = new Contact(name, phone, email);

		dao.create(c);

	} // end insertNewContact

	private void selectContactByIndex() {
		while (true) {
			try {
				System.out.print("검색할 인덱스>> ");
				int index = Integer.parseInt(sc.nextLine());

				if (!dao.isValidIndex(index)) {
					System.out.println("해당 인덱스에는 연락처 정보가 없습니다.");
					return;
				}
				System.out.printf("%d %s\n", index, dao.readIndex(index));
				return;

			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 인덱스를 입력해주세요.");
				System.out.println();
			}
		}

	} // end selectContactByIndex

	private void selectAllContacts() {
		System.out.println("---------------- 연락처 -----------------");

		if (dao.read().size() != 0) {
			for (int i = 0; i < dao.read().size(); i++) {
				System.out.printf("%d %s \n", i, dao.read().get(i));
			}
		} else {
			System.out.println(dao.read());
		}

		System.out.println("---------------------------------------");
	}

	/**
	 * 메인 메뉴 출력.
	 * 
	 * @return 메뉴 선택 입력 값.
	 */
	private int showMainMenu() {
		System.out.println();
		System.out.println("----------------------------------------------------");
		System.out.println("[1]전체리스트 [2]인덱스검색 [3]새연락처 [4]수정 [5]삭제 [0]종료");
		System.out.println("----------------------------------------------------");

		while (true) {
			try {
				System.out.print("메뉴 선택> ");
				int n = Integer.parseInt(sc.nextLine());
				return n;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());

			}
		}
	} // end showMainMenu

} // end class
