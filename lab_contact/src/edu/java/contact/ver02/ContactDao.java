package edu.java.contact.ver02;

// MVC 아키텍쳐에서 Controller의 인터페이스 - 메서드 정의
public interface ContactDao {

    /**
     * 신규 연락처 정보 등록. Argument를 받아 Contact객체를 배열에 저장.
     * 
     * @param m 신규 등록할 연락처 정보.
     * @return 배열에 새로운 연락처 저장이 성공하면 1, 그렇지 않으면 0을 리턴.
     */
    int create(Contact m);

    /**
     * 전체 리스트 출력
     * 
     * @return 전체 연락처가 저장된 배열.
     */
    Contact[] read();

    /**
     * 인덱스를 입력받아 연락처 검색 기능 Contact에서 찾아서 리턴.
     * 
     * @param index
     * @return 배열의 index 위치에 null이 아닌 Member 객체가 있으면 그 객체를 리턴. index가 배열의 범위 밖에 있거나,
     *         해당 인덱스의 배열 원소가 null이면 null을 리턴.
     */
    Contact read(int index);

    /**
     * 연락처 정보 업데이트 기능. 해당 인덱스의 연락처정보 수정.
     * 
     * @param index
     * @param name
     * @param phone
     * @param email
     * @return 연락처 정보를 수정하면 1, 그렇지 않으면 0을 리턴
     */
    int update(int index, String name, String phone, String email);

}
