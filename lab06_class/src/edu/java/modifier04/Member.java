package edu.java.modifier04;

/*
 * field: 아이디, 비밀번호
 * constructor: argument 2개를 갖는 생성자.
 * method: 아이디 getter, 비밀번호 getter/setter
 */
public class Member {
    // field
    private String id;
    private String pwd;

    // constructor
    public Member(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    // method

    public String getId() {
        return this.id;
    }

    public String getPassword() {
        return this.pwd;
    }

    public void setPassword(String pwd) {
        this.pwd = pwd;

    }
}
