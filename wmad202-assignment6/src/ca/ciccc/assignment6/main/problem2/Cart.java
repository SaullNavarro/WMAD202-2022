package ca.ciccc.assignment6.main.problem2;

import ca.ciccc.assignment6.main.problem0.Product;

public interface Cart {
    void addItem (Product product);
    float calculateTotalAmount ();
    void printReceipt();
}
