package com.coforge.assignment.day3;

public class ProductApp {

    public static void main(String[] args) {

        Product p = new Product();

        p.setProductId(101);
        p.setProductName("Laptop");
        p.setPrice(55000);
        p.setQuantity(2);

        p.displayBill();
    }
}