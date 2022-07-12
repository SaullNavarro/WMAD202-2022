package ca.ciccc.assignment6.main.problem2;

import ca.ciccc.assignment6.main.problem0.Product;

import java.util.ArrayList;

public class ShoppingCart implements Cart {
    ArrayList<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addItem(Product product) {
        this.products.add(product);
    }

    @Override
    public float calculateTotalAmount() {
        float total = 0;
        for (Product product : this.products) {
            total += product.getProductPrice();
        }
        return total;
    }

    @Override
    public void printReceipt() {
        for (Product product : this.products) {
            System.out.printf("%s: %f\n", product.getProductName(), product.getProductPrice());
        }
    }
}