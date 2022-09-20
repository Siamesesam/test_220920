package edu.java.file06;

import java.io.Serializable;

// ObjectInputStream, ObjectOutStream 
public class Product implements Serializable {
    // field
    private int productId;
    private String productName;
    private int productPrice;

    // constructor
    public Product() {
        // default constructor
    }

    public Product(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    //getter/setter method 
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return String.format("Product(productId = %d, productName = %s, produvtPrice = %d)", productId, productName,
                productPrice);
    }
}
