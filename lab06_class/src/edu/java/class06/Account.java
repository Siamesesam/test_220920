package edu.java.class06;

/**
 * 은행 계좌 정보 클래스. 계좌번호, 잔액을 필드로 갖고, 입금, 출금, 이체, 정보 출력 기능을 메서드로 갖음.
 */
public class Account {
    // field
    int accountNo; // 계좌번호
    double balance; // 잔고

    // constructor - argument 2개를 갖는 생성자.
    //
    //    public Account() {
    //        
    //    }
    //    
    public Account(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    /**
     * 입금(deposit)
     * 
     * @param amount 입금액
     * @return 입금 후 잔액을 리턴.
     */
    public double deposit(double amount) {
        this.balance += amount;
        return this.balance;
    }

    /**
     * 출금(withdraw)
     * 
     * @param amount 출금액
     * @return 출금 후 잔액을 리턴.
     */
    public double withdraw(double amount) {
        this.balance -= amount;
        return this.balance;
    }

    /**
     * 이체(transfer)
     * 
     * @param to     이체할 계좌 객체(Account 타입)
     * @param amount 이체할 금액
     * @return true(이체 성공).
     */
    public boolean transfer(Account to, double amount) { // 클래스 자체는 다른 기능도 하지만 변수를 저장하기위한 데이터 타입일 뿐이기도 하기때문에 Account 데이터 타입으로 사용해도 된다. 
        if (this.balance > amount) { // 이체할 금액이 계좌에 있을 경우.
            System.out.println("이체 완료");
            this.balance -= amount; // 출금되는 계좌에서는 뺀값을 저장.
            to.balance += amount; // 입금되는 계좌에서는 더한값을 저장.
            // this.withdraw(amount);
            // to.deposit(amount);
            return true;
        } else {
            System.out.println("잔액이 부족합니다.");
            return false;
        }

    }

    /**
     * 계좌 정보 출력(printAccountInfo). 계좌 번호와 잔액을 출력.
     */
    public void printAccountInfo() {
        System.out.println("계좌번호: " + this.accountNo);
        System.out.println("잔고: " + this.balance);
    }

}