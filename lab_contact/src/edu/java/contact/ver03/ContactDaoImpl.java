package edu.java.contact.ver03;

import java.util.ArrayList;
import java.util.List;

import edu.java.contact.ver02.Contact;

public class ContactDaoImpl implements ContactDao {

    private List<Contact> contactList = new ArrayList<>(); // List<Contact> 타입의 객체 생성.

    // singleton:
    // 1) null 값을 가진 객체 생성.
    private static ContactDaoImpl instance = null;

    // 2) default constructor
    private ContactDaoImpl() { // 다른곳에서 기본생성자를 호출할 수 있게끔하면 안되기때문에 private로 선언해줘야 한다.

    }

    /**
     * // 3) instance가 null이면 새로운 객체를 생성하고 그렇지 않으면 자기 자신을 리턴하게 끔 하는 메서드.
     * 
     * @return 자기자신을 호출하는 instance
     */
    public static ContactDaoImpl getInstance() {
        if (instance == null) {
            instance = new ContactDaoImpl();
        }
        return instance;
    }

    /**
     * index 범위에 해당하는 값이면 true를 넘겨주는 기능.
     * 
     * @param index
     * @return
     */
    public boolean isValidIndex(int index) {
        return (index >= 0) && (index < contactList.size());
    }

    @Override
    public List<Contact> read() {
        return contactList; //
    }

    @Override
    public Contact readIndex(int index) {
        return contactList.get(index);
    }

    @Override
    public int create(Contact contact) {
        if (contactList.add(contact)) { // add 메서드 문서 읽어보면 
            return 1;
        }
        return 0;
    }

    @Override
    public int update(int index, Contact contact) {
        //        contactList.remove(index);
        //        contactList.add(index, contact);
        //        return 0;
        if (!isValidIndex(index)) {
            return 0;
        }
        //        Contact before = contactList.get(index);
        //        before.setName(contact.getName());
        //        before.setPhone(contact.getPhone());
        //        before.setEmail(contact.getEmail());
        //        return 1;

        contactList.set(index, contact);
        return 1;
    }

    @Override
    public int delete(int index) {
        if (!isValidIndex(index)) {
            return 0;
        }
        contactList.remove(index);
        return 1;
    }

}
