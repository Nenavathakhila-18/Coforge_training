package co.coforge.assignments.day4;

import java.util.ArrayList;

import com.coforge.assignment.day3.Product;

public class Cart {

    ArrayList<Product> products = new ArrayList<>();

   
    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(co.coforge.assignments.day4.Product p2) {
        products.remove(p2);
    }


    public void calculateBill() {

        double total = 0;

        for (Product product : products) {
            total = total + product.getPrice();
        }

        System.out.println("Total Bill = " + total);
    }

    
    public void displayProducts() {

        for (Product product : products) {
            System.out.println(product);
        }
    }
}