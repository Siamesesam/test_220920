package edu.java.generic03;

public class GenericCls<A, B> {
    // field
    private A item1;
    private B item2;

    // consturtor
    public GenericCls(A item1, B item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    // getter
    public A getItem1() {
        return item1;
    }

    public B getItem2() {
        return item2;
    }
}
