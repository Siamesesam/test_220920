package edu.java.inheritance01;

// 스마트 TV는 TV이다. (Smart TV "IS A" TV.)
// BasicTc: super/parent/base class
// SmartTv: sub/child/derived class

public class SmartTv extends BasicTv{
    // field
    private String ip;
    
    // getters/setter
    public String getIp() {
        return ip;
    }
    
    public void setIp(String ip) {
        this.ip = ip;
    }
}
