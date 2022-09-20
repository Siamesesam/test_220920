package edu.java.class02;

public class ClassMain02 {

    public static void main(String[] args) {
        // Product 타입의 객체를 생성.
        Product product1 = new Product(123456, "신라면", 900);
        System.out.println(product1.productName + " : " + product1.price);

        product1.setPrice(1050);
        System.out.println(product1.productName + " : " + product1.price);

    }

}
