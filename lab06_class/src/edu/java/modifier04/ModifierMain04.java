package edu.java.modifier04;

public class ModifierMain04 {

    public static void main(String[] args) {
        Member mem1 = new Member("java12", "1234");
        Member mem2 = new Member("SQL12", "4567");
        
        System.out.println(mem1.getId());
        System.out.println(mem1.getPassword());
        mem1.setPassword("9876");
        System.out.println(mem1.getPassword());
        // System.out.println(mem1.id);
        System.out.println(mem2.getId());
        System.out.println(mem2.getPassword());
        mem2.setPassword("123456879");
        System.out.println(mem2.getPassword());
        
//        mem1.id = "";
//        mem1.setId("");
        
        
        
        
        
    }

}
