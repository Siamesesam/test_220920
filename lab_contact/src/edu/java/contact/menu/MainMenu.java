package edu.java.contact.menu;

// enum: 열거형 상수들을 정의하는 특별한 종류의 "클래스".
// -> 생성자, 메서드를 정의할 수 있음.
public enum MainMenu {
    QUIT, SELECT_ALL, SELECT_BY_INDEX, CREATE, UPDATE, DELETE, UNKNOWN;

    public static MainMenu getValue(int n) {
        // 정수 n을 enum 타입 값으로 변환해서 리턴.
        MainMenu[] menu = values();
        if (n < 0 || n >= menu.length) {
            return menu[menu.length - 1];
            // return null;
        }
        return menu[n];
    }
}

/*
 * 연락처 프로그램 버전 0.3 
 * ContactDaoImpl 클래스에 있던 Contact[]제거 하고 -> ArrayList<Contact> (LinkedList<> 써도 되긴함)
 * 
 * 인덱스 삭제 기능 추가  // 이거 이넘클래스 임폴트해서 걍 그대로 쓰고 상수보면 내가 DELETE 추가 해놈 그대로 쓰면됌
 * Contact 클래스도 버전 0.2꺼 그대로 임폴트해서 쓰래
 * NumberFormatException 이거 트라이 캐치문으로 에러처리 
 * 강사님 깃허브에 lab12_collection - edu.java.list01 - ListMain01 이거 보면서 하면 될듯해여 
 * ContactDao 다시 정의해줬어 이거 깃허브에 있을텐데 같이 보내줄게용 1번 전체리스트 출력 (List<Contact> read();) 이거를 
 * 메인에서 1번 눌렀을 때 아무것도 없으면 빈배열 [] 이거 출력시키고 뭐 있으면 그냥 그거 출력
 * 
 * 걍 배열을 리스트로 바꿔서 버전 업그레이드 시키면 되용
 */
