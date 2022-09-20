package edu.java.contact.ver03;

import java.util.List;

import edu.java.contact.ver02.Contact;

public interface ContactDao {

    /**
     * 연락처 정보를 저장하고 있는 리스트를 리턴.
     * 
     * @return List<Contact>. 연락처가 하나도 없는 경우에는 빈 리스트를 리턴.
     */
    List<Contact> read(); // 여기서 Array나 Linked 를 안쓴 이유: List로 선언하고 뭐든 써도 좋다라는 의미. 와 이거 질문하려했는데 바로 알려주시네.

    /**
     * 인덱스 검색 기능.
     * 
     * @param index 연락처를 리스ㅡ에서 검색하기 위한 인덱스.
     * @return Contact 객체. 해당 인덱스의 연락처 정보가 없는 경우에는 null을 리턴.
     */
    Contact readIndex(int index);

    /**
     * 새 연락처 추가 기능.
     * 
     * @param contact 리스트에 추가(add)할 연락처 정보.
     * @return 리스트에 저장 성공하면 1, 그렇지 않으면 0.
     */
    int create(Contact contact); 

    /**
     * 연락처 정보 업데이트 기능.
     * 
     * @param index   업데이트하려는 연락처의 인덱스. 0이상의 정수.
     * @param contact 업데이트할 정보.
     * @return 업데이트 성공하면 1, 그렇지 않으면 0.
     * 
     * 
     */
    int update(int index, Contact contact);

    /**
     * 연락처 삭제 기능.
     * 
     * @param index 삭제하려는 연락처의 인덱스. 0이상의 정수.
     * @return 삭제 성공하면 1, 그렇지 않으면 0.
     */
    int delete(int index);

    // 연락처 프로그램 버전 3 
    // Contact[]제거 -> ArrayList<Contact>
    // 인덱스 삿제 기능 추가 
    // 넘버포맷 처리

}
