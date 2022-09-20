package edu.java.inheritance06;

public class User {
    // field: 사용자 아이디, 비밀번호
    private String id;
    private String pwd;

    // constructor
    public User() {

    }

    public User(String id, String pwd) {
        this.id = id;
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override // toString() 제정의: User 객체를 출력할 때 아이디와 비밀번호가 출력될 수 있도록. 
    public String toString() {
        String idPwd = String.format("id: %s  pwd: %s ", this.id, this.pwd);
        return idPwd;
    }

    @Override // equals() 재정의: 아이디가 일치하는 User 객체는 같은 객체.
    public boolean equals(Object obj) {
        boolean result = false;
        if (obj instanceof User) {
            User user = ((User) obj);
            result = (this.id.equals(user.id));
        }

        return result;
    }

    @Override // hashCode() 재정의: 아이디가 같으면 해쉬코드(int)도 같으면 됨.
    public int hashCode() {

        return this.id.hashCode();
    }
}
