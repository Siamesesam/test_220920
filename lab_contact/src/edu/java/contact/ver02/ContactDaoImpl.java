package edu.java.contact.ver02;

// MVC 아키텍쳐에서 Controller (구현) 클래스
public class ContactDaoImpl implements ContactDao {
    // Contact 객체를 저장할 배열의 최대 크기
    public static final int MAX_LENGTH = 3;

    // Contact 객체들을 저장할 배열 
    private Contact[] contactList = new Contact[MAX_LENGTH]; // ArrayList 활용 

    // 배열에 저장된 Contact 객체의 개수, Contact 객체가 배열에 저장될 때마다 1씩 증가.
    private int count = 0; // 불필요

    public int getCount() {
        return count;
    }

    // Controller 클래스는 Singleton으로 설계:
    // 1) 자기자신 타입의 private static인 변수 선언
    private static ContactDaoImpl instance = null;

    // 2) private 생성자
    private ContactDaoImpl() {
    }

    // 3) 자기자신 타입을 리턴하는 public static 메서드 정의.
    public static ContactDaoImpl getInstance() {
        if (instance == null) {
            instance = new ContactDaoImpl();
        }
        return instance;
    }

    /**
     * 인덱스가 유효하지 않으면.(0보다 작으면서 저장된 연락처 개수보다 많다면)
     * 
     * @param index
     * @return
     */
    public boolean isValidIndex(int index) {
        return (index >= 0) && (index < count);
    }
    
    public boolean isMemoryAvailable() {
        return count < MAX_LENGTH;
    }
    
    @Override
    public int create(Contact m) {
        contactList[count] = m;
        count++;
        return 1;
    }

    @Override
    public Contact[] read() {
        // contactList에 저장된 Contact 객체의 개수만큼 크기의 배열을 새로 생성 .
        Contact[] contacts = new Contact[count];
        for (int i = 0; i < count; i++) {
            contacts[i] = contactList[i]; // null이 아닌 값을 복사.
        }
        return contacts;
    }

    @Override
    public Contact read(int index) { // 아 여기서 이미 맥스로 하든 카운트로 하든 검사를 한번해서 어레이바운더리가 안뜸 ㅇㅇ 
        // TODO Auto-generated method stub
        if (index >= 0 && index < MAX_LENGTH) { // main에서 isMemoryAbailable() 을 사용하면 중복돼서 이중검사를 하게 됌 
            return contactList[index];
        } else {
            return null;
        }
    }

    @Override
    public int update(int index, String name, String phone, String email) {
        if (index >= 0 && index < count) {
            contactList[index].setName(name);
            contactList[index].setPhone(phone);
            contactList[index].setEmail(email);
            return 1;
        } else {
            return 0;
        }
    }
}
